package com.bhlee.kotlinproject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "user")
data class UserProfile(
        @PrimaryKey(autoGenerate = true)
        var id : Long?,
        var nickname : String)