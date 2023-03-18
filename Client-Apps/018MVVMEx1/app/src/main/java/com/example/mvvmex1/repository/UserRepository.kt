package com.example.dbexample1.repository


import android.util.Log
import com.example.dbexample1.dao.UserDao
import com.example.mvvmex1.entity.User
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao : UserDao) {

    fun getUsers() : Flow<List<User>> {
        Log.d(" users count ", "getUsers repo : ")
        return userDao.getAllUsers()
    }

    //var users : Flow<List<User>> = userDao.getAllUsers()


    fun insertUser(user : User) {
        userDao.insert(user)
    }
}