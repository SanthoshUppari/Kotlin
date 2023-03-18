package com.example.layoutex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var showActButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(" Second ACtivity ", "onCreate: ")
        showActButton = findViewById(R.id.button)

        showActButton.setOnClickListener {
            var intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(" Second ACtivity ", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(" Second ACtivity ", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(" Second ACtivity ", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(" Second ACtivity ", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(" Second ACtivity ", "onDestroy: ")
    }
}