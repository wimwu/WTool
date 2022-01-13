package com.wim.tool.util

import android.app.Activity
import android.graphics.Point


/**
 * @author wim
 * @date 2021/12/1
 */
object ScreenUtils {

    fun getScreenWidth(activity: Activity): Point {
        val displayMetrics = activity.resources.displayMetrics
        return Point(displayMetrics.widthPixels, displayMetrics.heightPixels)
    }

}