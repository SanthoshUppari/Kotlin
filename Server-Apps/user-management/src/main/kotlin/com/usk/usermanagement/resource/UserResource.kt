package com.usk.usermanagement.resource

import com.usk.usermanagement.dto.UserDto
import com.usk.usermanagement.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
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

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Int): UserDto {
        return userService.getUserById(userId)
    }

    @PutMapping("/{userId}")
    fun updateUser(@PathVariable userId: Int, @RequestBody userDto: UserDto) : UserDto {
        return userService.updateUser(userId, userDto)
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: Int) : String {
        userService.deleteUser(userId)
        return "User deleted successfully.";
    }
}