package com.wim.tool.http

import android.content.Context
import androidx.annotation.StringRes
import com.wim.tool.R

/**
 * @author wim
 * @date 2021/10/25
 */
enum class ApiErrorType(val code: Int, @param: StringRes private val messageId: Int) {
    NOT_FOUND(404, R.string.api_error_not_found),
    SERVICE_ERROR(500, R.string.api_error_service),
    CONNECTION_TIMEOUT(408, R.string.api_error_time_out),
    UNEXPECTED_ERROR(700, R.string.api_error_unexpected);

    private val DEFAULT_CODE = 1

    fun getApiErrorModel(context: Context): ApiErrorModel {
        return ApiErrorModel(DEFAULT_CODE, context.getString(messageId))
    }

}