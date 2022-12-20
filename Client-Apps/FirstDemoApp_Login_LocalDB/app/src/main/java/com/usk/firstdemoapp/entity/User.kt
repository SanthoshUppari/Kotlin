package com.usk.firstdemoapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
class User(var username : String,
                var password : String,
                var address : String,
                ){
    @PrimaryKey(autoGenerate = true)
    var id = 0
}


