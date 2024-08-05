package com.aurionpro.exceptions;

public class AgeNotValidException extends RuntimeException{
	private int age;
	
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}


	public String getMessage() {
		return "Age should be more than 18. You have entered age as: " + age;
	}
}
