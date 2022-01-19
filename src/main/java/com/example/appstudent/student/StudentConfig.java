package com.example.appstudent.student;

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
            Student hakim = new Student(
                    "Hakim",
                    "hakim@gmail.com",
                    LocalDate.of(1999, Month.OCTOBER,23)
            );

            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2002, Month.DECEMBER,31)
            );

            studentRepository.saveAll(
                    List.of(hakim, mariam)
            );
        };
    }

}
