package com.example.mvvmex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.dbexample1.database.UserDatabase
import com.example.dbexample1.repository.UserRepository
import com.example.mvvmex1.entity.User

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        var name : EditText = findViewById(R.id.regname)
        var pwd :EditText = findViewById(R.id.regpwd)
        var save : Button = findViewById(R.id.regbutton)

        save.setOnClickListener {
            val database = UserDatabase.getInstance(this)
            val repository = UserRepository(database.userDao())

            repository.insertUser(User(name.text.toString(), pwd.text.toString()))
        }
    }
}