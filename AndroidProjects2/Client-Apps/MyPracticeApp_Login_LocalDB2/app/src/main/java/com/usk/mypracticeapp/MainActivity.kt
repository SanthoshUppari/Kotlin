package com.usk.mypracticeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(){

    lateinit var registration : Button
    lateinit var login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registration = findViewById(R.id.buttonreg)
        login = findViewById(R.id.buttonlogin)

        registration.setOnClickListener {
            var intent = Intent(this@MainActivity, RegActivity::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {
            var intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}