package com.example;

import com.example.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        1L, "Rinos", "rinos@gmail.com", LocalDate.of(2002, Month.FEBRUARY, 21), 23
                )
        );
    }

}
