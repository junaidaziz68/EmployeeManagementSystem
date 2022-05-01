package com.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.entity.Department;
import com.qa.repository.DepartmentRepository;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/department")
@CrossOrigin("*")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Get all users method
	@GetMapping
	public List<Department> getAllDepartment() {
		return this.departmentRepository.findAll();
	}
//Get user by id 

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") long departmentId) {

		return this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + departmentId));
	}

//Create users
	@PostMapping
	public Department createDepartment(@RequestBody Department department) {
		return this.departmentRepository.save(department);
	}

//update users 

	// @PutMapping("/{id}")
	// public Department updateDepartment(@RequestBody Department department,
	// @PathVariable("id") long departmentId) {
	// Department existingDepartment =
	// this.departmentRepository.findById(departmentId)
	// .orElseThrow(() -> new ResourceNotFoundException("department not found with
	// id :" + departmentId));

	// existingDepartment.setId(department.getId());
	// existingDepartment.setname(department.getname());
	// return this.departmentRepository.save(existingDepartment);

	// }

	// Delete users

	/*
	 * @DeleteMapping("/{id}") public ResponseEntity<Department>
	 * deleteUser(@PathVariable("id") long userId) { Department existingUser =
	 * this.departmentRepository.findById(userId) .orElseThrow(() -> new
	 * ResourceNotFoundException("User not found with id :" + userId));
	 * this.departmentRepository.delete(existingUser); return
	 * ResponseEntity.ok().build(); }
	 * 
	 */

}
