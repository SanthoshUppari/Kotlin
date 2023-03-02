package com.example.layoutex1

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

     @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(" MainACtivity ", "onCreate: ")

    }

    override fun onStart() {
        super.onStart()
        Log.d(" MainACtivity ", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(" MainACtivity ", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(" MainACtivity ", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(" MainACtivity ", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(" MainACtivity ", "onDestroy: ")
    }

}