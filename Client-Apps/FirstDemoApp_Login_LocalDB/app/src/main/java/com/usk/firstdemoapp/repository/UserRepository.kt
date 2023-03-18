package com.usk.firstdemoapp.repository

import android.app.Application
import android.content.Context
import androidx.annotation.WorkerThread
import com.usk.firstdemoapp.dao.UserDao
import com.usk.firstdemoapp.database.UserDatabase
import com.usk.firstdemoapp.entity.User

class UserRepository(application: Context) {

    private lateinit var userDao : UserDao

    private val database = UserDatabase.getInstance(application)

    init {
        userDao = database.userDao()
    }

    @WorkerThread
    fun insert(user : User){
        userDao.inset(user)
    }

    fun getUser(username : String, password : String ) : User {
        return userDao.getUser(username, password)
    }

}