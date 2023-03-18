package com.usk.mypracticeapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test_user")
class User(var username : String,
                var password : String,
                var address : String){

    @PrimaryKey(autoGenerate = true)
    var id = 0
}

