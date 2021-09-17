package com.example.demo.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.time.LocalDate


@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    fun readyStudentList(): MutableList<Student> {
        return studentRepository.findAll()
    }

    fun addNewStudent(student: Student) {
        val list = studentRepository.findStudentByEmail(student.email)
        if (list.isPresent) {
            throw IllegalAccessException("Email already present")
        }
        println(student)
        studentRepository.save(student)
    }

    fun updateStudent(id: String) {

        val student = studentRepository.findById(id)
        if (student.isPresent) {
            studentRepository.save(student.get())
        }
        println(student)
    }

}