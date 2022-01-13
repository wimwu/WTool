package com.wim.tool.data.repository

import com.wim.tool.data.entity.User
import com.wim.tool.data.room.dao.UserDao
import com.wim.tool.http.service.UserService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * @author wim
 * @date 2021/11/15
 */
class UserRepository @Inject constructor(val userDao: UserDao, val userService: UserService){

    suspend fun getUser(userId: String): Flow<User> {
        refreshUser(userId)
        // Returns a Flow object directly from the database.
        return userDao.load(userId)
    }

    private suspend fun refreshUser(userId: String) {
        // Check if user data was fetched recently.
        try {
            val response = userService?.getUser(userId)
            userDao.insert(response?.value!!)
        } catch (throwable: Throwable) {
            // If anything throws an exception, inform the caller
        }
    }

}