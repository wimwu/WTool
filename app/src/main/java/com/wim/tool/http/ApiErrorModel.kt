package com.wim.tool.http

import com.squareup.moshi.JsonClass

/**
 * @author wim
 * @date 2021/10/25
 */
@JsonClass(generateAdapter=true)
data class ApiErrorModel(var status: Int, var message: String)