package com.example.mvvmex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dbexample1.database.UserDatabase
import com.example.dbexample1.repository.UserRepository
import com.example.mvvmex1.adapter.UserAdapter
import com.example.mvvmex1.viewmodel.UserViewModel
import com.example.mvvmex1.viewmodel.UserViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var userViewModel : UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView : RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var userAdapter = UserAdapter()
        recyclerView.adapter = userAdapter


        val database = UserDatabase.getInstance(this)
        val repository = UserRepository(database.userDao())
        var userViewModelFactory = UserViewModelFactory(repository)

        userViewModel = ViewModelProvider(this, userViewModelFactory).get(UserViewModel::class.java)

        userViewModel.users.observe(this, Observer { users ->
            Log.d(" users count ", users.size.toString())
            userAdapter.setDBUsers(users)
        })
    }
}