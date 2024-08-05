package com.aurionpro.model;

import com.aurionpro.exceptions.emailNotValidException;
import com.aurionpro.exceptions.passwordNotValidException;

public class User {

	private String email;
	private String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void emailValidator(String email) {
		if (email == null || email.isEmpty()) {
			throw new emailNotValidException("Email is not entered.");
		}
		if (!email.matches(".+@.+\\..+")) {
			throw new emailNotValidException("Email is in invalid format.");
		}
	}

	public static void passwordValidator(String password) {
		if (password == null || password.isEmpty()) {
			throw new passwordNotValidException("Password input should not be empty. Please enter a password!");
		}
		if (password.length() < 8) {
			throw new passwordNotValidException("Password length should be greater than or equal to 8 charcaters");
		}
		if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$")) {
			throw new passwordNotValidException("Password does not meet the criteria.");
		}
	}

	@Override
	public String toString() {
		return "User Created Successfully \nEmail Address: " + email + "\t Password: " + password;
	}
}