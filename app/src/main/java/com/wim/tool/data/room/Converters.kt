package com.wim.tool.data.room

import android.text.TextUtils
import androidx.room.TypeConverter
import com.wim.tool.ARRAY_SPLIT
import java.lang.StringBuilder
import java.util.*

/**
 * @author wim
 * @date 2021/10/28
 */
class Converters {

    @TypeConverter fun calendarToDatestamp(calendar: Calendar): Long = calendar.timeInMillis

    @TypeConverter fun datestampToCalendar(value: Long): Calendar =
        Calendar.getInstance().apply { timeInMillis = value }

    @TypeConverter
    open fun arrayToString(array: Array<String>): String {
        if (array == null || array.size === 0) {
            return "";
        }
        val builder = StringBuilder(array[0])
        for (i in 1 until array.size) {
            builder.append(ARRAY_SPLIT).append(array[i])
        }
        return "$builder"
    }

    @TypeConverter
    open fun stringToArray(value: String): Array<String>? {
        return if(TextUtils.isEmpty(value)) null else value.split(ARRAY_SPLIT).toTypedArray()
    }

}