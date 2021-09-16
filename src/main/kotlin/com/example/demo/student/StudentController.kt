package com.example.demo.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate


@RestController
@RequestMapping("/api/v1/students")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun getStudents() = studentService.readyStudentList()


}