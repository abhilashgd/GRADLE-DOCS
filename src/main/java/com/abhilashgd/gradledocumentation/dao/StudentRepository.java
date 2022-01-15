package com.abhilashgd.gradledocumentation.dao;

import com.abhilashgd.gradledocumentation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

   // @Query("SELECT s FROM Student s WHERE s.email =?1")
    Optional<Student> findStudentByEmail(String email);
}
