package com.example.togglebuttonstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView
    lateinit var toggleBut : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.imageView)
        toggleBut = findViewById(R.id.toggleButton)

        toggleBut.setOnCheckedChangeListener { compoundButton, isChecked ->

            if(isChecked){
                image.visibility = View.INVISIBLE
            }else{
                image.visibility = View.VISIBLE
            }
        }
    }
}