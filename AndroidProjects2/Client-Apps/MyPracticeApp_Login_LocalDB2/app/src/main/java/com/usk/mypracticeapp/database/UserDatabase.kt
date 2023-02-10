package com.usk.mypracticeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.usk.mypracticeapp.dao.UserDao
import com.usk.mypracticeapp.entity.User

@Database(entities = [User::class], version = 1 )
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object{

        private var instance : UserDatabase? = null

        @Synchronized
        fun getInstance(context : Context) : UserDatabase{

            if(instance == null){
                instance = Room.databaseBuilder(context.applicationContext,
                UserDatabase::class.java, "test_db").allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }

    }
}