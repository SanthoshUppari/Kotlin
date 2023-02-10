package com.usk.mypracticeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.title = "Login here"

        username = findViewById(R.id.loginusername)
        password = findViewById(R.id.loginpassword)
        login = findViewById(R.id.login)

        login.setOnClickListener {
            var user = UserRepo(applicationContext).getUser(username.text.toString(), password.text.toString())
            if(user == null){
                Toast.makeText(applicationContext, "Invalid credetials, Login failed." , Toast.LENGTH_LONG).show()
            } else {
                var intent = Intent(this@LoginActivity, DBActivity::class.java)
                intent.putExtra("username" , username.text.toString())
                startActivity(intent)
            }
        }


    }
}