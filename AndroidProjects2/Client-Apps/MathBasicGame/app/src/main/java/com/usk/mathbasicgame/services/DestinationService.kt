package com.usk.mathbasicgame.services

import com.usk.mathbasicgame.model.Destination
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface DestinationService {

    @GET("/current?lon=77.580643&lat=12.972442&lang=en")
    @Headers(
        "X-RapidAPI-Key: cc36d7ddfamsh554d72775a063c5p12457ejsne082b2ecdce0",
        "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"
    )
    fun getTemparature(): Call<Destination>
}