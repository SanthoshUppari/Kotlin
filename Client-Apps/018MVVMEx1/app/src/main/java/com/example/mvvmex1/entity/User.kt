package com.example.mvvmex1.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_tb")
class User (var userName : String,
            var pwd : String,)  {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}