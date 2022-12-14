package com.usk.usermanagement.resource

import com.usk.usermanagement.dto.UserDto
import com.usk.usermanagement.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource(
    private val userService : UserService
) {

    @PostMapping
    fun createUser(@RequestBody userDto : UserDto) : UserDto {
        return userService.craeteuser(userDto)
    }

    @GetMapping
    fun getUsers() : List<UserDto> {
        return userService.getUsers()
    }
}