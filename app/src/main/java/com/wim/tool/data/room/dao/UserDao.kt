package com.wim.tool.data.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.wim.tool.data.entity.User
import kotlinx.coroutines.flow.Flow

/**
 * @author wim
 * @date 2021/10/27
 */
@Dao
interface UserDao: BaseDao<User> {

    @Query("SELECT * FROM user WHERE objectId = :userId")
    fun load(userId: String): Flow<User>

    @Query("SELECT * FROM user")
    fun loadAll(): Flow<List<User>>
}