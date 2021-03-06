package com.nathanmkaya.rentlykotlin.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PropertyRepository : JpaRepository<Property, Long> {
}