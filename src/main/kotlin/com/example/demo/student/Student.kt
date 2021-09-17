package com.example.demo.student

import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@Table
data class Student(
    @Id
    val id: String?= UUID.randomUUID().toString(),
    val name: String = "",
    val age: Int=0,
    val dob: LocalDate? = null,
    val email: String = ""
)
