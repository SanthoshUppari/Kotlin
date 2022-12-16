package com.usk.feignservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignServiceApplication

fun main(args: Array<String>) {
    runApplication<FeignServiceApplication>(*args)
}
