package com.example.usermgmt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.usermgmt.database.UserDatabase
import com.example.usermgmt.entity.User
import com.example.usermgmt.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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
            var dataBase = UserDatabase.getInstance(this)
            var userRepository = UserRepository(dataBase.getUserDao())

           lifecycleScope.launch(Dispatchers.IO){
               userRepository.insertUser(User(username.text.toString(), password.text.toString()))

               withContext(Dispatchers.Main){
                   Toast.makeText(applicationContext, "User saved successfully", Toast.LENGTH_LONG).show()
               }


            }

        }


    }
}