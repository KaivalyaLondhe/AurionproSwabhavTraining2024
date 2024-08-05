package com.aurionpro.exceptions;

public class overOverDraftLimitException extends RuntimeException{
	private double amount;

	public overOverDraftLimitException(double debit) {
		super();
		this.amount = debit;
	}
	public String getMessage() {
		return "The amound you are trying to debit Rs. " + amount + " exceeds even your over draft limit. ";
	}
}
