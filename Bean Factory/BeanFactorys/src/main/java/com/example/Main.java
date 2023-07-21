package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = context.getBean(UserService.class);
		userService.authenticateUser("Abhishek", "121");
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.saveUser(new User("Maheshwari", "1234"));

	}

}
