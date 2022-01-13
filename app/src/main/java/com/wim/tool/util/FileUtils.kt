package com.wim.tool.util

import android.content.Context
import android.os.Environment
import java.io.File

/**
 * 文件工具类
 * Created by ThirtyDegreesRay on 2016/8/4 13:30
 */
object FileUtils {
    private const val AUDIO_CACHE_DIR_NAME = "audio"
    private const val SIGN_IMAGE_CACHE_DIR_NAME = "sign_image"
    private const val HTTP_CACHE_DIR_NAME = "http_response"

    /**
     * 获取缓存文件夹
     *
     * @param context 上下文
     * @param dirName 文件夹名称
     * @return 缓存文件夹
     */
    fun getCacheDir(context: Context, dirName: String): File {
        val rootDir = context.externalCacheDir
        val cacheFile = File(rootDir, dirName)
        if (!cacheFile.exists()) {
            cacheFile.mkdir()
        }
        return cacheFile
    }

    /**
     * 获取音频缓存文件夹
     *
     * @param context 上下文
     * @return 音频缓存文件夹
     */
    fun getAudioCacheDir(context: Context): File {
        return getCacheDir(context, AUDIO_CACHE_DIR_NAME)
    }

    /**
     * 获取图片缓存文件夹
     *
     * @param context 上下文
     * @return 图片缓存文件夹
     */
    fun getSignImageCacheDir(context: Context): File {
        return getCacheDir(context, SIGN_IMAGE_CACHE_DIR_NAME)
    }

    /**
     * 获取网络请求缓存文件夹
     * @param context 上下文
     * @return 网络请求缓存文件夹
     */
    @JvmStatic
    fun getHttpCacheDir(context: Context): File {
        return getCacheDir(context, HTTP_CACHE_DIR_NAME)
    }

    /**
     * 检查内部存储是否可用
     * @return
     */
    val isExternalStorageEnable: Boolean
        get() = Environment.getExternalStorageState() ==
                Environment.MEDIA_MOUNTED
}