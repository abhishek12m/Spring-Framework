package com.example.service;

import com.example.repository.UserRepository;

public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public void authenticateUser(String username, String password) {
		System.out.println("Authenticating user :" + username);
	}
}
