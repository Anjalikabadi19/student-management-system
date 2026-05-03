package com.example.students.service;

import com.example.students.model.Student;
import com.example.students.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    // GET all students
    //Student is the entity name -database name
    //List<Student>
    //contains 3 objects
    //Student(1, A, 20)
    //Student(2, B, 22)
    //Student(3, C, 23)
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // ADD student
    //save() always returns entity
    public Student addStudent(Student student) {
        return repo.save(student);
    }
}