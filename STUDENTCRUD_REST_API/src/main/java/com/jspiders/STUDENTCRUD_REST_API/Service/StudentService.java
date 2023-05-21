package com.jspiders.STUDENTCRUD_REST_API.Service;

import com.jspiders.STUDENTCRUD_REST_API.Model.Student;
import com.jspiders.STUDENTCRUD_REST_API.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public void addStudents(Student s) {
        repository.save(s);
    }

    public List<Student> displayStudent() {
        List<Student> studentList=repository.findAll();
        return studentList;
    }

    public void updateStudent(Student c) {

        repository.save(c);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
