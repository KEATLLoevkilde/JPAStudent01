package com.example.jpastudent01.repositories;

import com.example.jpastudent01.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
