package com.example.acttoactdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var submit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        submit = findViewById(R.id.submit)

        submit.setOnClickListener {
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("name", name.text.toString())
            intent.putExtra("email", email.text.toString())
            startActivity(intent)

        }
    }
}