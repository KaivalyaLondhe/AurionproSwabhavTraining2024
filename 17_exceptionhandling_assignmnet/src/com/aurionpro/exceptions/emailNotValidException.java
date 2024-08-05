package com.aurionpro.exceptions;

public class emailNotValidException extends RuntimeException {
	
	private String message;

public emailNotValidException(String message) {
    super(message);  
    this.message = message;  
}

	@Override
	public String getMessage() {
		return message; 
	}
}