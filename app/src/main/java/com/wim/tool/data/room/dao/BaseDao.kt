package com.wim.tool.data.room.dao

import androidx.room.*


/**
 * @author wim
 * @date 2021/10/28
 */
@Dao
interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItems(items: List<T>)

    @Delete
    fun delete(item: T)

    @Update
    fun update(item: T)
}