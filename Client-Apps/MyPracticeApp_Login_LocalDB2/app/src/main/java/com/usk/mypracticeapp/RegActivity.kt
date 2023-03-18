package com.usk.mypracticeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.usk.mypracticeapp.entity.User

class RegActivity : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var address : EditText
    lateinit var registration : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        supportActionBar!!.title = "Register here"

        username = findViewById(R.id.regname)
        password = findViewById(R.id.regpassword)
        address = findViewById(R.id.regaddr)
        registration = findViewById(R.id.regbutton)

        registration.setOnClickListener {
            UserRepo(applicationContext).insert(User(username.text.toString(), password.text.toString(), address.text.toString()))
            Toast.makeText(applicationContext, "User Registered Successfully.", Toast.LENGTH_LONG).show()
            var intent = Intent(this@RegActivity, MainActivity::class.java)
            startActivity(intent)
        }


    }
}