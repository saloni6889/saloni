package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.model.StudentData;
import com.student.repository.StudentRepository;

@Component
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<StudentData> getAllStudents() {
        return repo.findAll();
    }

    public StudentData addStudent(StudentData student) {
        return repo.save(student);
    }

    public StudentData updateStudent(StudentData student) {
        return repo.save(student);
    }

    public Optional<StudentData> getStudentById(int id) {
        return repo.findById(id);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
