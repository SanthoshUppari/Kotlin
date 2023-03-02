package com.example.sharedprefex1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var addr : EditText
    lateinit var submit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        addr = findViewById(R.id.address)
        submit = findViewById(R.id.submit)

    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    fun saveData(){
        Log.d(" Sharedpref ", "saveData: ")
        var sharedPref = this.getSharedPreferences("saveUserData", Context.MODE_PRIVATE)
        var editor = sharedPref.edit()

        editor.putString("name", name.text.toString())
        editor.putString("email", email.text.toString())
        editor.putString("addr", addr.text.toString())

        editor.apply()

        Toast.makeText(applicationContext, "Data saved successfully.", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        retriveData()
    }

    fun retriveData(){
        Toast.makeText(applicationContext, "retriveData successfully.", Toast.LENGTH_LONG).show()
        var sharedPref = this.getSharedPreferences("saveUserData", Context.MODE_PRIVATE)
        name.setText(sharedPref.getString("name", null))
        email.setText(sharedPref.getString("email", null))
        addr.setText(sharedPref.getString("addr", null))
    }

}