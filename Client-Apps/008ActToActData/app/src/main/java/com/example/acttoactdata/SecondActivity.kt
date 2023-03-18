package com.example.acttoactdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    lateinit var textData : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textData = findViewById(R.id.textView)

        textData.setText(intent.getStringExtra("name")+" "+intent.getStringExtra("email"))

    }
}