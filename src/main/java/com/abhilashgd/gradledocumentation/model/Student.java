package com.abhilashgd.gradledocumentation.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@NoArgsConstructor
@Data
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;

    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Integer getAge(){
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public Student(String name, String email, LocalDate dob) {
        this.name=name; this.email=email; this.dob=dob;
    }
}
