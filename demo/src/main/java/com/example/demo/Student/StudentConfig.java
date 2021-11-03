package com.example.demo.Student;

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
            Student alexander = new Student(
                    "Alexander",
                    "alexander.ivanov@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 3)
            );
            Student alice = new Student(
                    "Alice",
                    "alice@gmail.com",
                    LocalDate.of(1998, Month.JANUARY, 3)
            );
            repository.saveAll(
                    List.of(alexander, alice)
            );
        };
    }
}
