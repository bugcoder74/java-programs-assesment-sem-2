package com.example.studentreg.controller;

import com.example.studentreg.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final List<Student> studentList = new ArrayList<>();

    @PostMapping
    public String registerStudent(@RequestBody Student student) {
        studentList.add(student);
        return "Student registered successfully!";
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentList;
    }
}
