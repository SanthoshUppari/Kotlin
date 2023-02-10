package com.example.applifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("AppLifecycle 2", "onCreate: ==>>")
    }

    override fun onStart() {
        super.onStart()
        Log.d("AppLifecycle 2", "onStart: ==>>")
    }

    override fun onResume() {
        super.onResume()
        Log.d("AppLifecycle 2", "onResume: ==>>")
    }

    override fun onPause() {
        super.onPause()
        Log.d("AppLifecycle 2", "onPause: ==>>")
    }

    override fun onStop() {
        super.onStop()
        Log.d("AppLifecycle 2", "onStop: ==>>")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("AppLifecycle 2", "onRestart: ==>>")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AppLifecycle 2", "onDestroy: ==>>")
    }
}