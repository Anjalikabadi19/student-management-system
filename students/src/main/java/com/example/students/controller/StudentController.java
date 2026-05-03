package com.example.students.controller;

import com.example.students.model.Student;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This class handles REST API requests , Returns JSON automatically
@RestController

// Base URL for all APIs in this class: http://localhost:8080/students
@RequestMapping("/students")
public class StudentController {

    //Spring automatically creates service object
    @Autowired
    private StudentService service;

    // GET all students, Handles GET request
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // ADD student
    //Handles POST request
    //Takes JSON input
    //Converts JSON → Student object
    //Saves it
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
}

//@RequestBody tells Spring:
//“Convert incoming JSON data into a Java object”