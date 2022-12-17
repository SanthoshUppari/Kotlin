package com.usk.mathbasicgame.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiveBuilder {

    val URL = "https://weatherbit-v1-mashape.p.rapidapi.com/"

    fun getInstance() : Retrofit {
        return Retrofit.Builder().baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}