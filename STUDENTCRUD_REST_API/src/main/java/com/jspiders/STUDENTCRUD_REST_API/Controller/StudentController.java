package com.jspiders.STUDENTCRUD_REST_API.Controller;

import com.jspiders.STUDENTCRUD_REST_API.Model.Student;
import com.jspiders.STUDENTCRUD_REST_API.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    //add students
    @PostMapping("/addstudents")
    public void addStudents(@RequestBody Student s)
    {
        service.addStudents(s);
    }

    //display student
    @GetMapping("/displaystudents")
    List<Student> displayStudent()
    {
        List<Student> studentList=service.displayStudent();
        return studentList;
    }

    //update students
    @PutMapping("/updatestudents")
    public void updateStudents(@RequestBody Student c)
    {
        service.updateStudent(c);
    }

    //delete student
    @DeleteMapping("/deletestudents/{id}")
    public void deleteStudents(@PathVariable(value = "id") int id) {
        service.deleteById(id);
    }

}
