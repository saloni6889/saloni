package com.example3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example3.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
