package com.nathanmkaya.rentlykotlin.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Property(@Id @GeneratedValue(strategy = GenerationType.AUTO) val Id: Long? = null,
                    var location: String,
                    var noOfRooms: Int,
                    var type: String,
                    var size: Double) {
}