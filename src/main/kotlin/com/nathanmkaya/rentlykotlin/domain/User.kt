package com.nathanmkaya.rentlykotlin.domain

import javax.persistence.*

@Entity
data class User(@Id @GeneratedValue(strategy = GenerationType.AUTO) val Id: Long? = null,
                var firstName: String? = null,
                var lastName: String? = null,
                var email : String? = null,
                @Enumerated(EnumType.STRING) var userType: UserType? = null,
                var property: Array<Property>? = null) {

    private constructor() : this(firstName = "")

}