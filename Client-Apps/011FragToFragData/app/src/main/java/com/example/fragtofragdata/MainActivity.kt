package com.example.fragtofragdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fm : FragmentManager = supportFragmentManager
        var ft : FragmentTransaction = fm.beginTransaction()
        var firstFragment = FirstFragment()
        ft.add(R.id.frame, firstFragment)
        ft.commit()
    }
}