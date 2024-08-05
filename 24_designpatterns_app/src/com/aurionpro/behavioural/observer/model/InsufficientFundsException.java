package com.aurionpro.behavioural.observer.model;

public class InsufficientFundsException extends RuntimeException{
	@Override
	public String getMessage() {
		return "The balance in your account is insufficient to perform this operation.";
		
	}
}
