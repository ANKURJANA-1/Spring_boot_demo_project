package com.example.demo

import com.example.demo.student.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/hi")
class Hello {

    @GetMapping
    fun hi() = rest()

    fun rest(): ArrayList<Student> {
        val list: ArrayList<Student> = ArrayList()
//        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
//        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
//        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
//        list.add(Student(1, "Ankur Jana", 23, LocalDate.MAX, "ankurjana905@gmail.com"))
        return list
    }
}