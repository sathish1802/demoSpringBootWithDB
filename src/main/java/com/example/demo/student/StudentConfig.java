package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", LocalDate.of(2000, 12, 21), 27, "Mariam@gmail.com"
            );
            Student alex = new Student("Alex", LocalDate.of(1999, 12, 21), 27, "alext@gmail.com"
            );
            repository.saveAll(List.of(mariam,alex));
        };
    }
}

