package com.aurionpro.model;

public class BankTransferPayment implements Payment{

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment made through bank transfer");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Refunded to bank");
	}
	
}
