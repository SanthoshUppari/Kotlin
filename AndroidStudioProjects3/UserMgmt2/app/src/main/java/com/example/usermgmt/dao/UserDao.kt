package com.example.usermgmt.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.usermgmt.entity.User
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDao {

    @Insert
    fun insertUser(user : User)

    @Query("select * from user_tab where username = :username and password = :password")
    fun getUser(username : String, password : String) : User

    @Query("select * from user_tab")
    fun getAllUsers() : Flow<List<User>>

}