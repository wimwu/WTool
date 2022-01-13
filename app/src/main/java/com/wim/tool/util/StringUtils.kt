package com.wim.tool.util

import java.lang.StringBuilder
import java.util.*

/**
 * StringUtil
 * Created by ThirtyDegreesRay on 2016/7/14 16:18
 */
object StringUtils {
    @JvmStatic
    fun isBlank(str: String?): Boolean {
        return str == null || str.trim { it <= ' ' } == ""
    }

    fun isBlankList(list: List<*>?): Boolean {
        return list == null || list.isEmpty()
    }

    fun stringToList(str: String, separator: String): List<String>? {
        var list: List<String>? = null
        if (!str.contains(separator)) {
            return list
        }
        val strs = str.split(separator).toTypedArray()
        list = Arrays.asList(*strs)
        return list
    }

    fun listToString(list: List<String?>, separator: String): String {
        val stringBuilder = StringBuilder("")
        if (list.size == 0 || isBlank(separator)) {
            return stringBuilder.toString()
        }
        for (i in list.indices) {
            stringBuilder.append(list[i])
            if (i != list.size - 1) {
                stringBuilder.append(separator)
            }
        }
        return stringBuilder.toString()
    }

    fun getSizeString(size: Long): String? {
        when {
            size < 1024 -> {
                return String.format(Locale.getDefault(), "%d B", size)
            }
            size < 1024 * 1024 -> {
                val sizeK = size / 1024f
                return String.format(Locale.getDefault(), "%.2f KB", sizeK)
            }
            size < 1024 * 1024 * 1024 -> {
                val sizeM = size / (1024f * 1024f)
                return String.format(Locale.getDefault(), "%.2f MB", sizeM)
            }
            size / 1024 < 1024 * 1024 * 1024 -> {
                val sizeG = size / (1024f * 1024f * 1024f)
                return String.format(Locale.getDefault(), "%.2f GB", sizeG)
            }
            else -> return null
        }
    }
}