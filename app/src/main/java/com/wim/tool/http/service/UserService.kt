package com.wim.tool.http.service

import androidx.lifecycle.LiveData
import com.wim.tool.LEAN_CLOUD_MODULE_USER
import com.wim.tool.LEAN_CLOUD_X_LC_SESSION
import com.wim.tool.data.entity.User
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

/**
 * @author wim
 * @date 2021/10/25
 */
interface UserService {

    @GET(LEAN_CLOUD_MODULE_USER)
    suspend fun getUsers(): LiveData<List<User>>

    /**
     * 根据 sessionToken 获取用户信息
     */
    @GET("$LEAN_CLOUD_MODULE_USER/me")
    suspend fun getMe(@Header(LEAN_CLOUD_X_LC_SESSION) sessionToken: String): LiveData<User>

    @GET("$LEAN_CLOUD_MODULE_USER/{userId}")
    suspend fun getUser(@Path("userId") userId: String): LiveData<User>
}