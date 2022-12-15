package com.usk.mathbasicgame

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.usk.mathbasicgame.model.Destination
import com.usk.mathbasicgame.services.DestinationService
import com.usk.mathbasicgame.services.ServiveBuilder
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var multi : Button
    lateinit var tempButton : Button

    var temparature : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title = "Simple Math Game"

        addition = findViewById(R.id.addButton)
        subtraction = findViewById(R.id.subButton)
        multi = findViewById(R.id.mulButton)
        tempButton = findViewById(R.id.buttonTemp)

        addition.setOnClickListener {

            val intent = Intent(this@MainActivity, GameActivity::class.java)
            startActivity(intent);

        }

        subtraction.setOnClickListener {

            val intent = Intent(this@MainActivity, SubActivity::class.java)
            startActivity(intent);

        }

        multi.setOnClickListener {

            val intent = Intent(this@MainActivity, MulActivity::class.java)
            startActivity(intent);

        }

        tempButton.setOnClickListener {
            if(temparature == ""){
                getTemparature()
            }
            tempButton.setText(temparature)
        }

    }

    fun getTemparature(){

        val destinationService = ServiveBuilder.buidService(DestinationService::class.java)
        val resultCall = destinationService.getTemparature()

        resultCall.enqueue(object: Callback<Destination>{
            override fun onResponse(call: Call<Destination>, response: Response<Destination>) {
                if(response.isSuccessful){
                    val destinations = response.body()!!
                    tempButton.setText(destinations.data.get(0).temp)
                }
            }

            override fun onFailure(call: Call<Destination>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })



    }


    fun getTemparatureOld(){

        if (Build.VERSION.SDK_INT > 9) {
            val policy = ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
        }

        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=77.580643&lat=12.972442&lang=en")
            .get()
            .addHeader("X-RapidAPI-Key", "cc36d7ddfamsh554d72775a063c5p12457ejsne082b2ecdce0")
            .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
            .build()
        val response = client.newCall(request).execute()
        Log.d("Temp", "getTemparature: ${response.body().toString()}")
        temparature = response.body().toString()
    }

}