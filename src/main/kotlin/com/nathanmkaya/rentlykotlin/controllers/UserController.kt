package com.nathanmkaya.rentlykotlin.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UserController {

    @RequestMapping("/login")
    fun login() : String{

        return "login"
    }

    @RequestMapping("/register")
    fun register(): String{

        return "registration"
    }
}