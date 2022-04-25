package com.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.entity.User;
import com.qa.repository.UserRepository;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// Get all users method
	@GetMapping
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}
//Get user by id 

	@GetMapping("/{id}")
	public User getUserById(@PathVariable(value = "id") long userId) {

		return this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userId));
	}

//Create users
	@PostMapping
	public User createUser(@RequestBody User user) {
		return this.userRepository.save(user);

	}
}
