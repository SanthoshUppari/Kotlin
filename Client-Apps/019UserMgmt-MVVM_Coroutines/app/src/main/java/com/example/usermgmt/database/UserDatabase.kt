package com.example.usermgmt.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.usermgmt.dao.UserDao
import com.example.usermgmt.entity.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun getUserDao() : UserDao

    companion object{

        @Volatile
        private var instance : UserDatabase? = null

        @Synchronized
        fun getInstance(context: Context) : UserDatabase{
            if(instance == null){
                instance = Room.databaseBuilder(context.applicationContext,
                    UserDatabase::class.java, "user_mgmt")
                    //.allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }


}