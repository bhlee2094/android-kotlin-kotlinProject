package com.bhlee.kotlinproject

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
public interface UserProfileDao {
    @Insert(onConflict = REPLACE)
    fun insert(user : UserProfile)

    @Update
    fun update(user: UserProfile)

    @Delete
    fun delete(user: UserProfile)

    @Query("SELECT * FROM user")
    fun getAll() : List<UserProfile>

}