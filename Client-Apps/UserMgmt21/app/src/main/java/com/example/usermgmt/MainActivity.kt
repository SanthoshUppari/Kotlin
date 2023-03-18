package com.example.usermgmt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.usermgmt.client.TemperaterService
import com.example.usermgmt.entity.User
import com.example.usermgmt.model.Destination
import com.example.usermgmt.retrofit.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var register : Button = findViewById(R.id.regbutton)
        var login : Button = findViewById(R.id.logbutton)
        var showusers : Button = findViewById(R.id.showusersbt)
        var tempbut : Button = findViewById(R.id.tempbutton)


        register.setOnClickListener {
            var intent = Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {
            var intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        showusers.setOnClickListener {
            var intent = Intent(this@MainActivity, UserActivity::class.java)
            startActivity(intent)
        }

        tempbut.setOnClickListener {

            var tempClient = RetrofitBuilder.getInstance().create(TemperaterService::class.java).getTemperater()
            tempClient.enqueue(object : Callback<Destination>{

                override fun onResponse(call: Call<Destination>, response: Response<Destination>) {
                    tempbut.setText(response.body()!!.data.get(0).temp.toString())
                }

                override fun onFailure(call: Call<Destination>, t: Throwable) {

                }


            })
        }
    }
}