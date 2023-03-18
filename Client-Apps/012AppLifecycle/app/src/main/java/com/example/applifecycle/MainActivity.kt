package com.example.applifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AppLifecycle", "onCreate: ==>>")

        button = findViewById(R.id.button)

        button.setOnClickListener {
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("AppLifecycle", "onStart: ==>>")
    }

    override fun onResume() {
        super.onResume()
        Log.d("AppLifecycle", "onResume: ==>>")
    }

    override fun onPause() {
        super.onPause()
        Log.d("AppLifecycle", "onPause: ==>>")
    }

    override fun onStop() {
        super.onStop()
        Log.d("AppLifecycle", "onStop: ==>>")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("AppLifecycle", "onRestart: ==>>")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AppLifecycle", "onDestroy: ==>>")
    }
}