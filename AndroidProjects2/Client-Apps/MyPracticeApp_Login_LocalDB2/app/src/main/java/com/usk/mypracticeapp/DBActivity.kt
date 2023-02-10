package com.usk.mypracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DBActivity : AppCompatActivity() {

    lateinit var username : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dbactivity)

        supportActionBar!!.title = "Dashboard"

        username = findViewById(R.id.username)

        username.setText(intent.getStringExtra("username"))


    }
}