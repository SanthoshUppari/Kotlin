package com.example.usermgmt.repository

import android.content.Context
import android.util.Log
import androidx.annotation.WorkerThread
import androidx.lifecycle.lifecycleScope
import com.example.usermgmt.dao.UserDao
import com.example.usermgmt.database.UserDatabase
import com.example.usermgmt.entity.User
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao : UserDao) {

    suspend fun insertUser(user : User){
        Log.d(" coroutine-test ", "insertUser: dao")
        userDao.insertUser(user)
    }

    fun getUser(username : String, password : String) : User {
        return userDao.getUser(username, password)
    }

    fun getUsers() : Flow<List<User>> {
        return userDao.getAllUsers()
    }

}