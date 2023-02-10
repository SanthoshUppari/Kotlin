package com.usk.feignservice.resource


import com.usk.feignservice.dto.UserDto
import com.usk.feignservice.feignclient.UserClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sub")
class FeignResource(
    private val userClient: UserClient
) {

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Int): UserDto {
        return userClient.getUserById(userId)
    }


}