package com.nathanmkaya.rentlykotlin.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/property")
class PropertyController {

    @RequestMapping("/add")
    fun addProperty() : String {
        return "addproperty"
    }

    @RequestMapping("/properties")
    fun listProperties() : String {
        return "properties"
    }
}