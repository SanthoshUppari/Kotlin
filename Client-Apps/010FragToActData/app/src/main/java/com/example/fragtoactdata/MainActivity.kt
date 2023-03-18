package com.example.fragtoactdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var textdata : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textdata = findViewById(R.id.textdata)

        var fm : FragmentManager = supportFragmentManager
        var ft : FragmentTransaction = fm.beginTransaction()
        var myFragment = MyFragment()

        ft.add(R.id.frame, myFragment)
        ft.commit()
    }

    fun takeData(name: String){
        textdata.text = name
    }

}