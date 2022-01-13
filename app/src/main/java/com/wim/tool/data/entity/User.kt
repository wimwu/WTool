package com.wim.tool.data.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

/**
 * @author wim
 * @date 10/19/21
 */
@Parcelize
@Entity(tableName = "user")
data class User(
    @PrimaryKey
    @ColumnInfo(name = "objectId")
    val userId: String,
    val avatar: String?,
    val phone: String,
    val email: String,
    val password: String,
    @ColumnInfo(name = "short_id")
    val shortId: String,
    @ColumnInfo(name = "user_name")
    val userName: String,
    @ColumnInfo(name = "real_name")
    val realName: String?,
    @ColumnInfo(name = "session_token")
    val sessionToken: String,
    @ColumnInfo(name = "email_verified")
    val emailVerified: String?,
    @ColumnInfo(name = "phone_verified")
    val phoneVerified: String?,
    @ColumnInfo(name = "create_date")
    val createDate: Long,
    @ColumnInfo(name = "update_date")
    val updateDate: Long
) : Parcelable

