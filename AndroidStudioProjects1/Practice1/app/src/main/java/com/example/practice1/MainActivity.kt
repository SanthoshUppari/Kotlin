package com.example.practice1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myButton : Button
    lateinit var name : EditText
    lateinit var nameTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.mybutton)
        name = findViewById(R.id.editTextName)
        nameTextView = findViewById(R.id.textViewName)

        myButton.setOnClickListener {
            nameTextView.setText(name.text.toString())
        }
    }
}