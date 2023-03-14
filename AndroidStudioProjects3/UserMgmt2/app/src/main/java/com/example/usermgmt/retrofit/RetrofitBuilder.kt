package com.example.usermgmt.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    val URL = "https://weatherbit-v1-mashape.p.rapidapi.com"

    fun getInstance() : Retrofit{
        return Retrofit.Builder().baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}