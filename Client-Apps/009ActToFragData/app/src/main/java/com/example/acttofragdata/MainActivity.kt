package com.example.acttofragdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fm : FragmentManager = supportFragmentManager
        var ft : FragmentTransaction = fm.beginTransaction()
        var testFragment = TestFragment()

        name = findViewById(R.id.name)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("name", name.text.toString())
            testFragment.arguments = bundle

            ft.add(R.id.frameLayout, testFragment)
            ft.commit()
        }
    }
}