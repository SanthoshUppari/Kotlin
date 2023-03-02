package com.example.datatrasferex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var data : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        data = findViewById(R.id.textView)

        data.setText(intent.getStringExtra("name")+" "+intent.getStringExtra("phone"))
    }
}