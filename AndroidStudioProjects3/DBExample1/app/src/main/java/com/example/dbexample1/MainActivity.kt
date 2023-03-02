package com.example.dbexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.dbexample1.entity.User
import com.example.dbexample1.repository.UserRepository

class MainActivity : AppCompatActivity() {

    lateinit var userName : EditText
    lateinit var pwd : EditText
    lateinit var register : Button
    lateinit var login : Button
    lateinit var data : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.username)
        pwd = findViewById(R.id.password)
        register = findViewById(R.id.register)
        login = findViewById(R.id.login)
        data = findViewById(R.id.textView)

        register.setOnClickListener {
            UserRepository(applicationContext).insertUser(User(userName.text.toString(), pwd.text.toString()))
            data.text = "User saved successfully."
            Toast.makeText(applicationContext, "User saved successfully.", Toast.LENGTH_LONG).show()
        }

        login.setOnClickListener {
            var user = UserRepository(applicationContext).getUser(userName.text.toString(), pwd.text.toString())
            if(user == null){
                data.text = "Invalid credentials."
                Toast.makeText(applicationContext, "Invalid credentials.", Toast.LENGTH_LONG).show()
            }else {
                data.text = "${userName.text.toString()} Login successfull."
                Toast.makeText(applicationContext, "${userName.text.toString()} Login successfull.", Toast.LENGTH_LONG).show()
            }
        }
    }
}