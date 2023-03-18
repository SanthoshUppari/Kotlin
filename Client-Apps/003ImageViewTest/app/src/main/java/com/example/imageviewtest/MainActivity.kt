package com.example.imageviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var myImage : ImageView
    lateinit var myButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImage = findViewById(R.id.imageView1)
        myButton = findViewById(R.id.button1)

        myButton.setOnClickListener {
            myImage.setImageResource(R.drawable.image2)
        }
    }
}