package com.example.usermgmt.client

import com.example.usermgmt.model.Destination
import  retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.Call

interface TemperaterService {

    @GET("/current?lon=77.580643&lat=12.972442&lang=en")
    @Headers(
        "X-RapidAPI-Key: cc36d7ddfamsh554d72775a063c5p12457ejsne082b2ecdce0",
        "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"
    )
    fun getTemperater() : Call<Destination>
}