package com.wim.tool.http.service

import com.wim.tool.LEAN_CLOUD_MODULE_USER
import com.wim.tool.http.ApiResponse
import com.wim.tool.data.entity.User
import retrofit2.Call
import retrofit2.http.*

/**
 * @author wim
 * @date 2021/10/26
 */
interface AuthService {

    @FormUrlEncoded
    @POST(LEAN_CLOUD_MODULE_USER)
    suspend fun register(@Body user: User): Call<ApiResponse<User>>

    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @Field("account") account: String,
        @Field("password") password: String
    ): Call<ApiResponse<User>>
}