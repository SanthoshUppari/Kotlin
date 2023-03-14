package com.example.usermgmt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.usermgmt.entity.User
import com.example.usermgmt.repository.UserRepository

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.title = "Login here"

        var username : EditText = findViewById(R.id.logusername)
        var password : EditText = findViewById(R.id.logpassword)
        var login : Button = findViewById(R.id.loginbutton)
        var data : TextView = findViewById(R.id.textView)

        login.setOnClickListener {
            var user : User //UserRepository(applicationContext).getUser(username.text.toString(), password.text.toString())
            /*if(user == null){
                data.text = "Invalid credentials."
            }else{
                data.text = "Welcome ${user.username}"
            }*/
        }
    }
}