package com.example;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void displayMessage() {
		System.out.println("message :" + message);
	}

}
