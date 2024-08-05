package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {

	private long accountNumber;
	private String name;
	private double balance;
	
	
	public CurrentAccount(long accountNumber, String name, double balance) {
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


	@Override
	public double credit(double amount) {
		// TODO Auto-generated method stub
		return balance += amount;
	}

	@Override
	public double debit(double amount) {
		// TODO Auto-generated method stub
		return balance -=amount;
	}


	@Override
	public String toString() {
		return "CurrentAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
