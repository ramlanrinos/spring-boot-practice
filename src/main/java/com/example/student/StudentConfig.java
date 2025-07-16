package com.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student rinos = new Student("Rinos", "rinos@gmail.com", LocalDate.of(2002, Month.FEBRUARY, 21), 23);
            Student rosy = new Student("Rosy", "rosy@gmail.com", LocalDate.of(2002, Month.MARCH, 17), 23);

            studentRepository.saveAll(
                    List.of(rinos, rosy)
            );
        };
    }
}
