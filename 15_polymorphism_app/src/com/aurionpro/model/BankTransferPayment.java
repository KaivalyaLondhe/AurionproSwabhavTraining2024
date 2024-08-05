package com.aurionpro.model;

public class BankTransferPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Payment processed through bank transfer");
	}
	@Override
	public void refund() {
		System.out.println("Refunded through bank transfer");
	}
}
