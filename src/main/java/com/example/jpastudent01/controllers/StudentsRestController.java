package com.example.jpastudent01.controllers;

import com.example.jpastudent01.models.Student;
import com.example.jpastudent01.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
