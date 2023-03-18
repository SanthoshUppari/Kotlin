package com.usk.firstdemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity() {

    lateinit var registration : Button
    lateinit var login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registration = findViewById(R.id.registration)
        login = findViewById(R.id.login)

        registration.setOnClickListener {
            val intent = Intent(this@MainActivity, RegActivity::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}