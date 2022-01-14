package com.abhilashgd.gradledocumentation.model;

import lombok.*;

import java.time.LocalDate;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/14/22
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;


}
