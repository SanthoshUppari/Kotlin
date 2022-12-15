package com.usk.mathbasicgame.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiveBuilder {

    private const val URL = "https://weatherbit-v1-mashape.p.rapidapi.com/"

    private val okHttp = OkHttpClient.Builder()

    private val builder = Retrofit.Builder().baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    private val retrofit = builder.build()

    fun <T> buidService(serviceType : Class<T>) : T{
        return retrofit.create(serviceType)
    }

}