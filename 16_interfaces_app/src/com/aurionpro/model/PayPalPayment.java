package com.aurionpro.model;

public class PayPalPayment implements Payment{

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment processed through PayPal");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Refunded to paypal");
	}

}
