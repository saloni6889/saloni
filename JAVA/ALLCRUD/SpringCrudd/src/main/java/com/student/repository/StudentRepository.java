package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.StudentData;

@Repository
public interface StudentRepository extends JpaRepository<StudentData, Integer> {

}