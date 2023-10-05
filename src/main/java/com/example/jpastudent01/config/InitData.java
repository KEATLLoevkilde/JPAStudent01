package com.example.jpastudent01.config;

import com.example.jpastudent01.models.Skole;
import com.example.jpastudent01.models.Student;
import com.example.jpastudent01.repositories.SkoleRepository;
import com.example.jpastudent01.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SkoleRepository skoleRepository;

    @Override
    public void run(String... args) throws Exception {
        Skole newSkole = new Skole();
        newSkole.setNavn("Skole01");
        skoleRepository.save(newSkole);

        Student newStudent = new Student();
        newStudent.setNavn("Thomas");
        newStudent.setBornDate(LocalDate.of(1984, 3, 8));
        newStudent.setBornTime(LocalTime.of(11, 11, 11));
        newStudent.setSkole(newSkole);

        studentRepository.save(newStudent);
    }
}
