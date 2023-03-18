package com.example.componectstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var phone : EditText
    lateinit var email : EditText
    lateinit var gender : RadioGroup
    lateinit var male : RadioButton
    lateinit var female : RadioButton
    lateinit var c : CheckBox
    lateinit var cpp : CheckBox
    lateinit var java : CheckBox

    lateinit var submit : Button
    lateinit var textData : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        phone = findViewById(R.id.phone)
        email = findViewById(R.id.email)
        gender = findViewById(R.id.gender)
        male = findViewById(R.id.male)
        female = findViewById(R.id.female)
        c = findViewById(R.id.checkBoxc)
        cpp = findViewById(R.id.checkBoxcpp)
        java = findViewById(R.id.checkBoxjava)
        submit = findViewById(R.id.buttonsub)
        textData = findViewById(R.id.textViewData)

        submit.setOnClickListener {
            textData.setText(name.text.toString()+phone.text.toString()+email.text.toString()+male.isChecked+c.isChecked)
        }

    }
}