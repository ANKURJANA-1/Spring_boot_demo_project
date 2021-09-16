package com.example.demo.student

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.time.LocalDate


@Service
class StudentService {

    fun readyStudentList(): ArrayList<Student> {
        val list: ArrayList<Student> = ArrayList()
        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
        return list
    }
}