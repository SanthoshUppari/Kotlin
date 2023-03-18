package com.example.datatrasferex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var data : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var fm : FragmentManager = supportFragmentManager
        var ft : FragmentTransaction = fm.beginTransaction()
        var myFragment = MyFragment()
        var secondFragment = SecondFragment()

        ft.add(R.id.myframeLayout, myFragment)
        ft.add(R.id.frameLayoutsecond, secondFragment)
        ft.commit()
    }

    fun takeData(name : String){
        data.text = name.toString()
    }

}