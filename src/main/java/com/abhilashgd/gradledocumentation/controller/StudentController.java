package com.abhilashgd.gradledocumentation.controller;

import com.abhilashgd.gradledocumentation.model.Student;
import com.abhilashgd.gradledocumentation.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        studentService.updateStudent(studentId,name,email);
    }

}
