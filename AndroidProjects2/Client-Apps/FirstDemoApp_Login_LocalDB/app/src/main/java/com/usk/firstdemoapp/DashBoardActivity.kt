package com.usk.firstdemoapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DashBoardActivity : AppCompatActivity() {

    lateinit var welcomeUserName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        supportActionBar!!.title = "Dashboard"

        welcomeUserName = findViewById(R.id.welcomeusername)

        welcomeUserName.setText(intent.getStringExtra("username"))


    }
}