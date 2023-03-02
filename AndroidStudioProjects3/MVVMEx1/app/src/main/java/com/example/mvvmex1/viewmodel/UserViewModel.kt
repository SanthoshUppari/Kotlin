package com.example.mvvmex1.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.example.dbexample1.repository.UserRepository
import com.example.mvvmex1.entity.User

class UserViewModel(private val userRepository : UserRepository) : ViewModel() {

    var users : LiveData<List<User>> = userRepository.getUsers().asLiveData()
}

class UserViewModelFactory(private val userRepository : UserRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(UserViewModel::class.java)){
            Log.d(" users count ", "UserViewModelFactory: ")
            return UserViewModel(userRepository) as T
        }else{
            throw java.lang.IllegalArgumentException("Un-known view model")
        }
    }

}