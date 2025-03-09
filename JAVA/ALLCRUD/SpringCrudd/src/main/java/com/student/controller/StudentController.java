package com.student.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.model.StudentData;
import com.student.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String first() {
        return "Student Controller is working";
    }

    @GetMapping("/all")
    public List<StudentData> getAllStudents() {
        return service.getAllStudents();
    } 
    
    @GetMapping("/{id}")
    public Optional<StudentData> getStudentById(@PathVariable("id") int id) {
        return service.getStudentById(id);
    }
   
    @PostMapping("/add")
    public StudentData addNewStudent(@RequestBody StudentData student) {
        return service.addStudent(student);
    }
//
//    @PutMapping("/update")
//    public Student updateStudent(@RequestBody Student student) {
//        return service.updateStudent(student);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteStudent(@PathVariable("id") int id) {
//        service.deleteStudent(id);
//    }
}
