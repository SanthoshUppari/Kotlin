package com.example.usermgmt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.usermgmt.entity.User
import com.example.usermgmt.repository.UserRepository

class RegistrationActivity : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var register : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        supportActionBar!!.title = "Register here"

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        register = findViewById(R.id.registerButton)

        register.setOnClickListener {
            //UserRepository(applicationContext).insertUser(User(username.text.toString(), password.text.toString()))
            //Toast.makeText(applicationContext, "User saved successfully", Toast.LENGTH_LONG).show()
        }


    }
}