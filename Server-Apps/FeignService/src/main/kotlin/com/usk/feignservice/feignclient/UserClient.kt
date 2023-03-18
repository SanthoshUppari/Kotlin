package com.usk.feignservice.feignclient

import com.usk.feignservice.dto.UserDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "user-service", url = "http://localhost:7777/user-management/users")
interface UserClient {

    @GetMapping("/{userId}")
    fun getUserById (@PathVariable("userId") userId : Int) : UserDto

}