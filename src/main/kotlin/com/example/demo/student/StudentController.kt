package com.example.demo.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDate


@RestController
@RequestMapping("/api/v1/students")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun getStudents() = studentService.readyStudentList()

    @PostMapping
    fun registerNewStudent(@RequestBody student: Student) {
        studentService.addNewStudent(student)
    }

    @PutMapping
    fun updateStdent(@PathVariable id:String) {
        studentService.updateStudent(id)
    }


}