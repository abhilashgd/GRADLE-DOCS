package com.abhilashgd.gradledocumentation.service;

import com.abhilashgd.gradledocumentation.dao.StudentRepository;
import com.abhilashgd.gradledocumentation.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public List<Student> getStudent(){
        return repository.findAll();
    }
}
