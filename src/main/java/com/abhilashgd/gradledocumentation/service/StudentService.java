package com.abhilashgd.gradledocumentation.service;

import com.abhilashgd.gradledocumentation.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
public interface StudentService {
    List<Student> getStudent();

    void addNewStudent(Student student);
    void deleteStudent(Long studentId);
    void updateStudent(Long studentId, String name, String email);
}
