package com.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
