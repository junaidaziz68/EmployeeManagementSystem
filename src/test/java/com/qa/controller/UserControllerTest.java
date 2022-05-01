package com.qa.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.entity.User;
import com.qa.repository.UserRepository;

@SpringBootTest
@AutoConfigureMockMvc // configures a bean for sending requests to our API
@ActiveProfiles({ "test" })
@Sql(scripts = { "classpath:schema.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@Mock
	private UserRepository userRepository;
	@InjectMocks
	private UserController userController;

	private List<User> user;

	@Test
	public void testCreateUser() {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetAllUsers() {

	@Test
	public void testGetUserById() {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		throw new RuntimeException("not yet implemented");
	}

}
