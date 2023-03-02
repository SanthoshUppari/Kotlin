package com.example.dbexample1.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.dbexample1.entity.User

@Dao
interface UserDao {

    @Insert
    fun insert(user : User)

    @Query("Select * from user_tb where userName = :userName and pwd = :pwd    ")
    fun getUser(userName : String, pwd:  String) : User

}