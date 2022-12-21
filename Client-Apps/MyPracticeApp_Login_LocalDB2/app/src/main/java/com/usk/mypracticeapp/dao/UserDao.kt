package com.usk.mypracticeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.usk.mypracticeapp.entity.User

@Dao
interface UserDao {

    @Insert
    fun insert(user : User)

    @Query("select * from test_user where username = :username and password = :password")
    fun getUser(username : String, password : String) : User
}