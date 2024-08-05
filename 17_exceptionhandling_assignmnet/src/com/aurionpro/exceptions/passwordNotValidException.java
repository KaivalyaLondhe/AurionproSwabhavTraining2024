package com.aurionpro.exceptions;

public class passwordNotValidException extends RuntimeException {

	private String message;

	public passwordNotValidException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}