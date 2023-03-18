package com.example.dbexample1.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvmex1.entity.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert
    fun insert(user : User)

    @Query("Select * from user_tb where userName = :userName and pwd = :pwd    ")
    fun getUser(userName : String, pwd:  String) : User

    @Query("select * from user_tb")
    fun getAllUsers() : Flow<List<User>>

}