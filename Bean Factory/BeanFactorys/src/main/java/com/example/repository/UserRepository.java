package com.example.repository;

import com.example.model.User;

public class UserRepository {
	public void saveUser(User user) {
		System.out.println("Saving user :" + user.getUserName());
	}
}
