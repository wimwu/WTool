package com.wim.tool.data.room

import android.content.Context
import androidx.room.*
import com.wim.tool.data.room.dao.UserDao
import com.wim.tool.DATABASE_NAME
import com.wim.tool.data.entity.User

/**
 * @author wim
 * @date 2021/10/27
 */
@Database(entities = [User::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase(){

    abstract fun userDao(): UserDao

    companion object{

        // For Singleton instantiation
        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .addCallback(object : Callback() {}).build()
        }
    }
}