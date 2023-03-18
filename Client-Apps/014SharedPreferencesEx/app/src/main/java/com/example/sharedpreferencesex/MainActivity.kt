package com.example.sharedpreferencesex

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var phone: EditText
    lateinit var comment : EditText
    lateinit var submit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phone)
        comment = findViewById(R.id.comment)
        submit = findViewById(R.id.submit)

        submit.setOnClickListener {

        }


    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    fun saveData(){
        var sf =this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        var editor = sf.edit()

        editor.putString("name", name.text.toString())
        editor.putString("email", email.text.toString())
        editor.putString("phone",phone.text.toString())
        editor.putString("coment", comment.text.toString())

        editor.apply()

        Toast.makeText(applicationContext, "Data saved successfully.", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        getData()
    }

    fun getData(){
        var sf =this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name.setText(sf.getString("name", null).toString())
        email.setText(sf.getString("email", null).toString())
        phone.setText(sf.getString("phone", null).toString())
        comment.setText(sf.getString("coment", null).toString())
    }
}