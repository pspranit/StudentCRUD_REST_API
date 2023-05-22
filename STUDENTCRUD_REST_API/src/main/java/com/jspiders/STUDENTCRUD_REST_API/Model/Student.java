package com.jspiders.STUDENTCRUD_REST_API.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students_info")
public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int studId;
    @Column(name = "s_name")
    private String studName;
    @Column(name = "s_gender")
    private String gender;
    @Column(name = "s_class")
    private String studClass;
    @Column(name = "s_marks")
    private int studMarks;

}
