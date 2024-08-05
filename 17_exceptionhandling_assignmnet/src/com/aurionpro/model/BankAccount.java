package com.aurionpro.model;

import com.aurionpro.exceptions.BankExceptions;

public class BankAccount {
	private long accountNumber;
	private String name;
	private double balance;
	public BankAccount(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount==0) {
			System.out.println("Please enter a valid amount. The amount cannot be zero.");
			return;
		}
		if(amount<0)
			throw new BankExceptions.NegativeAmountException();
		this.balance += amount;
	}
	public void withdraw(double amount) {
		if(amount==0) {
			System.out.println("Please enter a valid amount. The amount cannot be zero.");
			return;
		}
		if(amount<0)
			throw new BankExceptions.NegativeAmountException();
		if(amount>balance) 
			throw new BankExceptions.InsufficientFundsExcpetion();
		this.balance -= amount;
		
	}
}
