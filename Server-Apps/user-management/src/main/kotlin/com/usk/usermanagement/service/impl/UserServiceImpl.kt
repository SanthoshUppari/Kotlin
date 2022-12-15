package com.usk.usermanagement.service.impl

import com.usk.usermanagement.dto.UserDto
import com.usk.usermanagement.entity.User
import com.usk.usermanagement.repository.UserRepository
import com.usk.usermanagement.service.UserService
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository : UserRepository
) : UserService {

    override fun craeteuser(userDto: UserDto): UserDto {
        var user = User(userDto.id, userDto.firstName, userDto.lastName, userDto.age)
        userRepository.save(user)
        return UserDto(user.id, user.firstName, user.lastName, user.age)
    }

    override fun getUsers(): List<UserDto> {
        val users =  userRepository.findAll()
        return users.map{
            UserDto(it.id, it.firstName, it.lastName, it.age)
        }
    }

    override fun getUserById(userId: Int): UserDto {
        val optionalUser = userRepository.findById(userId)
        val user = optionalUser.get()
        return UserDto(user.id, user.firstName, user.lastName, user.age)
    }

    override fun updateUser(userId: Int, userDto: UserDto) : UserDto {
        val optionalUser = userRepository.findById(userId)
        val user = optionalUser.get()
        user.firstName = userDto.firstName
        user.lastName = userDto.lastName
        user.age = userDto.age
        userRepository.save(user)
        return UserDto(user.id, user.firstName, user.lastName, user.age)
    }

    override fun deleteUser(userId: Int) {
        userRepository.deleteById(userId)
    }

}