package com.example3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example3.model.User;
import com.example3.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> getAllUsers(){
		List<User> list = this.repo.findAll();
		return list;
	}
	
	public User addUser(User u) {
		User u1 = this.repo.save(u);
		return u1;
	}
	
	public User updateUser(User u) {
		return this.repo.save(u);
	}
	
	public Optional<User> getUserById(int id) {
		Optional<User> u = this.repo.findById(id);
		return u;
	}
	
	public void deleteUser(int id) {
		this.repo.deleteById(id);
	}	
}