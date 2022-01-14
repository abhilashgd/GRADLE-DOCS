package com.abhilashgd.gradledocumentation.service;

import com.abhilashgd.gradledocumentation.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@Service
public class StudentServiceImpl implements StudentService {
    public List<Student> getStudent(){
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
