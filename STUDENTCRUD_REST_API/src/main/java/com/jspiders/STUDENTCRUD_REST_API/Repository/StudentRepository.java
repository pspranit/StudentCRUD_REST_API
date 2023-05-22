package com.jspiders.STUDENTCRUD_REST_API.Repository;

import com.jspiders.STUDENTCRUD_REST_API.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
