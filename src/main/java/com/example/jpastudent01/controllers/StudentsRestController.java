package com.example.jpastudent01.controllers;

import com.example.jpastudent01.models.Student;
import com.example.jpastudent01.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/student")
    public ResponseEntity<Student> postStudent(@RequestBody Student  student) {
        Student savedStudent = studentRepository.save(student);
        if (savedStudent == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
        }
    }
}
