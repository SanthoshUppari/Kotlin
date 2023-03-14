package com.example.usermgmt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.example.usermgmt.entity.User
import com.example.usermgmt.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class UserViewModel(private val userRepositoty : UserRepository) : ViewModel() {


    var users : LiveData<List<User>> = userRepositoty.getUsers().asLiveData()

}

class UserViewModelFactory(private val userRepositoty : UserRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(UserViewModel::class.java)){
            return UserViewModel(userRepositoty) as T
        }else{
            throw java.lang.IllegalArgumentException("Unknown View model")
        }
    }

}