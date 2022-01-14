package com.abhilashgd.gradledocumentation.dao;

import com.abhilashgd.gradledocumentation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
