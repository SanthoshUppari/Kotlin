package com.usk.mypracticeapp

import android.content.Context
import com.usk.mypracticeapp.dao.UserDao
import com.usk.mypracticeapp.database.UserDatabase
import com.usk.mypracticeapp.entity.User

class UserRepo(context : Context) {

    private lateinit var userDao: UserDao

    private val database = UserDatabase.getInstance(context)

    init {
        userDao = database.userDao()
    }

    fun insert(user : User){
        userDao.insert(user)
    }

    fun getUser(username : String, password : String) : User {
        return userDao.getUser(username, password)
    }

}