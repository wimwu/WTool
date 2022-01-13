package com.wim.tool.util

import android.Manifest.permission
import android.text.TextUtils
import androidx.annotation.RequiresPermission
import java.net.InetAddress
import java.net.UnknownHostException

/**
 * 检测实时网络状态
 *
 *
 * @author Administrator
 */
enum class NetWorkUtils {
    INSTANCE;

    /**
     * 网络是否可用
     * @return
     */
    @RequiresPermission(permission.INTERNET)
    fun isAvailable(): Boolean {
        return isAvailableByDns()
    }

    @RequiresPermission(permission.INTERNET)
    fun isAvailableByDns(): Boolean {
        return isAvailableByDns("")
    }

    /**
     * 使用打开百度返回网络是否可用。
     */
    @RequiresPermission(permission.INTERNET)
    fun isAvailableByDns(domain: String?): Boolean {
        val realDomain = if (TextUtils.isEmpty(domain)) "www.baidu.com" else domain!!
        val inetAddress: InetAddress?
        return try {
            inetAddress = InetAddress.getByName(realDomain)
            inetAddress != null
        } catch (e: UnknownHostException) {
            e.printStackTrace()
            false
        }
    }
}