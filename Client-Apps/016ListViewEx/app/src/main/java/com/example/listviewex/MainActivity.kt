package com.example.listviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var namesList : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namesList = findViewById(R.id.namelist)

        var countryNames = resources.getStringArray(R.array.names)
        var adapter =  ArrayAdapter(this, android.R.layout.simple_list_item_1, countryNames)
        namesList.adapter = adapter
        namesList.setOnItemClickListener { parent, view, position, l ->
            var selectedName = parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext, "You clicked on "+selectedName, Toast.LENGTH_LONG).show()
        }
    }
}