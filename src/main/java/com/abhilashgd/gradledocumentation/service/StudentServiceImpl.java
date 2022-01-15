package com.abhilashgd.gradledocumentation.service;

import com.abhilashgd.gradledocumentation.dao.StudentRepository;
import com.abhilashgd.gradledocumentation.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Override
    public void addNewStudent(Student student) {
        //System.out.println(student);
        Optional<Student> studentOptional = repository
                .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        repository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        boolean exists = repository.existsById(studentId);

        if(!exists){
            throw new IllegalStateException(
                    "student with id "+studentId + " does not exist");
        }
        repository.deleteById(studentId);
    }

    @Override
    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        Student student = repository.findById(studentId)
                .orElseThrow(()-> new IllegalStateException(
                        "student with id " + studentId + " does not exist"
                        ));
        if(name!=null
                && name.length()>0 &&
                !Objects.equals(student.getName(),name)){
            student.setName(name);
        }

        if(email!=null
                && email.length()>0 &&
                !Objects.equals(student.getEmail(),email)){
            Optional<Student> studentOptional = repository
                    .findStudentByEmail(email);
            if (studentOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }

    }
}
