package com.aurionpro.exceptions;

public class BankExceptions {

	public static class InsufficientFundsExcpetion extends RuntimeException{
		public String getMessage() {
			return "Insufficient Funds availale in your account to complete this transaction. Available balance is: " ;
		}
	}
	public static class NegativeAmountException extends RuntimeException{
		public String getMessage() {
			return "Alert! The amount for withdrawal cannot be negative! Please enter a valid input.";
		}
	}
}
