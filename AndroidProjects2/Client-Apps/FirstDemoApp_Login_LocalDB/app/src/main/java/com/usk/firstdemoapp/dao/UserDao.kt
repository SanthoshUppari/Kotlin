package com.usk.firstdemoapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.usk.firstdemoapp.entity.User

@Dao
interface UserDao {

    @Insert
    fun inset(user : User)

    @Query("select * from user_table where username = :username and password = :password")
    fun getUser(username : String, password : String) : User
}