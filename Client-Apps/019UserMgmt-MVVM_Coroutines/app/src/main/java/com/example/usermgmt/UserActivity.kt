package com.example.usermgmt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.usermgmt.adapter.UserAdapter
import com.example.usermgmt.database.UserDatabase
import com.example.usermgmt.repository.UserRepository
import com.example.usermgmt.viewmodel.UserViewModel
import com.example.usermgmt.viewmodel.UserViewModelFactory

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        var recyclerView : RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var userAdapter = UserAdapter()
        recyclerView.adapter = userAdapter



        var dataBase = UserDatabase.getInstance(this)
        var userRepository = UserRepository(dataBase.getUserDao())
        var userViewModelFact = UserViewModelFactory(userRepository)

        var userViewModel = ViewModelProvider(this, userViewModelFact).get(UserViewModel::class.java)


        userViewModel.users.observe(this, Observer { users ->
            userAdapter.setDBUsers(users)
        })

    }
}