package com.example.usermgmt.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_tab")
class User(var username : String,
           var password : String) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}