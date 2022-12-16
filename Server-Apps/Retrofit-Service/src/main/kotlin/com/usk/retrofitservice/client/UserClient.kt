package com.usk.retrofitservice.client

import com.usk.retrofitservice.dto.UserDto
import retrofit2.Call

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserClient {

    @GET("users/{userId}")
    fun getUserById(@Path("userId") userId: Int): Call<UserDto>
}