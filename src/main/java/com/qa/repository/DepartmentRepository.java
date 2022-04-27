package com.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
