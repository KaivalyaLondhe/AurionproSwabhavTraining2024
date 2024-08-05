package com.aurionpro.model;

public class CreditCardPayment implements Payment{

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment processed through credit card");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Refunded to credit card");
	}
	
}
