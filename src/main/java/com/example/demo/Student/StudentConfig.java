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
            Student iman = new Student(
                    "Iman",
                    "iman@gmail.com",
                    LocalDate.of(2003, Month.NOVEMBER, 2)
            );
            Student sam = new Student(
                    "sam",
                    "sam@gmail.com",
                    LocalDate.of(2003, Month.NOVEMBER, 20)
            );
            repository.saveAll(
                    List.of(iman, sam)
            );
        };
    }
}
