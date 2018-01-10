package com.nathanmkaya.rentlykotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RentlyKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(RentlyKotlinApplication::class.java, *args)
}
