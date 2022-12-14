package com.usk.usermanagement.service

import com.usk.usermanagement.dto.UserDto

interface UserService {

    fun craeteuser(userDto: UserDto) : UserDto

    fun getUsers() : List<UserDto>
}