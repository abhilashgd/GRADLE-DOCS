package com.abhilashgd.gradledocumentation.config;

import com.abhilashgd.gradledocumentation.dao.StudentRepository;
import com.abhilashgd.gradledocumentation.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                    Student abhilash = new Student(
                            "abhilash",
                            "abhilash@test.com",
                            LocalDate.of(2000,1,5)
                            );

            Student abhi2 = new Student(
                    "abhi2",
                    "abhi2@test.com",
                    LocalDate.of(2010,1,5)
            );

            repository.saveAll(List.of(abhilash,abhi2));

        };
    }
}
