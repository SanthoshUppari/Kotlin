package com.usk.firstdemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.usk.firstdemoapp.entity.User
import com.usk.firstdemoapp.repository.UserRepository

class LoginActivity : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.title = "Login here"

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        login = findViewById(R.id.button)

        login.setOnClickListener {
            var user = UserRepository(applicationContext).getUser(username.text.toString(), password.text.toString())
            if(user == null){
                Toast.makeText(applicationContext, "Invalid credentials. Login failed" , Toast.LENGTH_LONG ).show()
            }else{
                var intent = Intent(this@LoginActivity, DashBoardActivity::class.java)
                intent.putExtra("username", username.text.toString())
                startActivity(intent)
            }

        }

    }
}