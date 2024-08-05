package com.aurionpro.model;

public class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Payment made through credit card");
	}
	@Override
	public void refund() {
		System.out.println("Refunded successfully to credit card");
	}
}
