package com.abhilashgd.gradledocumentation.controller;

import com.abhilashgd.gradledocumentation.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@RestController
public class StudentController {

    @GetMapping
    public List<Student> hello(){
        return List.of(
            new Student(
                    1L,
                    "abhilash",
                    "abhilash@test.com",
                    LocalDate.of(2000,01,05),
                    21

            )
        );
    }
}
