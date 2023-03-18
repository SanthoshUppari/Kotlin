package com.usk.firstdemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.usk.firstdemoapp.dao.UserDao
import com.usk.firstdemoapp.entity.User
import com.usk.firstdemoapp.repository.UserRepository

class RegActivity : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var address : EditText
    lateinit var registartion : Button
    lateinit var userDao : UserDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        supportActionBar!!.title = "Register here"

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        address = findViewById(R.id.addr)
        registartion = findViewById(R.id.regbutton)

        registartion.setOnClickListener {
            UserRepository(applicationContext).insert(User(username.text.toString(), password.text.toString(), address.text.toString()))
            Toast.makeText(applicationContext, "User registered successflly.", Toast.LENGTH_LONG).show()
            var intent = Intent(this@RegActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}