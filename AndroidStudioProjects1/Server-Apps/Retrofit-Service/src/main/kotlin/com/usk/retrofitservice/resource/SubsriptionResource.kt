package com.usk.retrofitservice.resource

import com.usk.retrofitservice.client.UserClient
import com.usk.retrofitservice.dto.UserDto
import com.usk.retrofitservice.retrofit.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.apache.juli.logging.Log
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@RestController
@RequestMapping("/sub")
class SubsriptionResource(
    private val retrofitHelper : RetrofitHelper
) {

   /* @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Int): UserDto {
        var userDto = UserDto(1,"","",20)
        val userClientApi = retrofitHelper.getInstance().create(UserClient::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            val result = userClientApi.getUserById(userId)
            if (result != null)
                userDto = UserDto(result.id, result.firstName, result.lastName,result.age)

        }
        return userDto
    }*/

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Int): UserDto {
        var userDto = UserDto(1,"","",20)
        val userClientApi = retrofitHelper.getInstance().create(UserClient::class.java).getUserById(userId)
        userClientApi.enqueue( object : Callback<UserDto>{

            override fun onResponse(call: Call<UserDto>, response: Response<UserDto>) {
                if(response?.body() != null){
                    userDto = UserDto(response.body()!!.id, response.body()!!.firstName, response.body()!!.lastName, response.body()!!.age)

                }
            }

            override fun onFailure(call: Call<UserDto>, t: Throwable) {
                userDto = UserDto(1,"Fail","",20)
            }
        })
        return userDto
    }


}