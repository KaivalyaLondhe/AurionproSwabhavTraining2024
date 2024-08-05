package com.aurionpro.model;

public class PayPalPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Payment made through paypal");
	}
	@Override
	public void refund() {
		System.out.println("Payment refunded to paypal");
	}
}
