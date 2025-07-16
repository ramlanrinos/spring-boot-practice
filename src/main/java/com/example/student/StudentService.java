package com.example.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L, "Rinos", "rinos@gmail.com", LocalDate.of(2002, Month.FEBRUARY, 21), 23
                )
        );
    }
}
