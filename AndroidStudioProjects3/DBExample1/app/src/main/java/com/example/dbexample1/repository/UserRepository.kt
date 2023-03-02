package com.example.dbexample1.repository

import android.content.Context
import com.example.dbexample1.dao.UserDao
import com.example.dbexample1.database.UserDatabase
import com.example.dbexample1.entity.User

class UserRepository(application : Context) {

    private lateinit var userDao : UserDao

    private val database = UserDatabase.getInstance(application)

    init{
        userDao = database.userDao()
    }

    fun insertUser(user : User){
        userDao.insert(user)
    }

    fun getUser(username : String, pwd : String) : User {
        return userDao.getUser(username, pwd)
    }

}