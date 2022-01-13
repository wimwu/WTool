package com.wim.tool

import android.app.Application
import android.content.Context
import cn.leancloud.LeanCloud
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.util.CoilUtils
import com.tencent.mmkv.MMKV
import dagger.hilt.android.HiltAndroidApp
import okhttp3.OkHttpClient

/**
 * @author wim
 * @date 2021/11/1
 */
@HiltAndroidApp
class App: Application(), ImageLoaderFactory {

    companion object {
        var sInstance: App? = null

        fun applicationContext() : Context {
            return sInstance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        sInstance = this
        MMKV.initialize(this)
        // 提供 this、App ID、绑定的自定义 API 域名作为参数
        LeanCloud.initializeSecurely(this, LEAN_CLOUD_APP_ID, LEAN_CLOUD_SERVICE_URL);
    }

    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(applicationContext)
            .crossfade(true)
            .okHttpClient {
                OkHttpClient.Builder().cache(CoilUtils.createDefaultCache(applicationContext)).build()
            }.build()
    }

}