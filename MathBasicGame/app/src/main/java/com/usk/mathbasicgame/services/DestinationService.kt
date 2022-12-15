package com.usk.mathbasicgame.services

import com.usk.mathbasicgame.model.Destination
import retrofit2.Call
import retrofit2.http.GET

interface DestinationService {

    @GET("/current?lon=77.580643&lat=12.972442&lang=en")
    fun getTemparature(): Call<Destination>
}