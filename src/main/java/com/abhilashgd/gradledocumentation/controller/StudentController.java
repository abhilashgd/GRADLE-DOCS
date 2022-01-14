package com.abhilashgd.gradledocumentation.controller;

import com.abhilashgd.gradledocumentation.model.Student;
import com.abhilashgd.gradledocumentation.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@RestController
@RequestMapping(path = "api/v1/student")
@RequiredArgsConstructor //takes care of autowired
public class StudentController {

    private final StudentService studentService;
    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
}
