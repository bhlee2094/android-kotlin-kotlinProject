package com.bhlee.kotlinproject

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(UserProfile::class), version = 1)
abstract class UserProfileDatabase : RoomDatabase() {
    abstract fun getUserProfileDao() : UserProfileDao

    companion object {
        var INSTANCE : UserProfileDatabase? = null

        fun getInstance(context: Context) : UserProfileDatabase? {
            if(INSTANCE == null){
                synchronized(UserProfileDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, UserProfileDatabase::class.java, "user.db")
                            .fallbackToDestructiveMigration()
                            .build()
                }
            }
            return INSTANCE
        }
    }
}