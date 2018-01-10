package com.nathanmkaya.rentlykotlin.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class Welcome {

    @Value("\${app.welcome.message}")
    private val MESSAGE = ""

    @Value("\${app.welcome.title}")
    private val TITLE = ""

    @RequestMapping("/welcome")
    fun welcome(model: MutableMap<String, Any>): String {
        println("This is called")
        model.put("title", TITLE)
        model.put("message", MESSAGE)
        return "welcome"
    }
}