package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student morris = new Student(
                    1L,
                    "Morrison",
                    "morris@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 4)
            );
            Student emeka = new Student(
                    2L,
                    "Emeka",
                    "emeka@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 5)
            );
            repository.saveAll(
                    List.of(morris, emeka)
            );

        };
    }
}
