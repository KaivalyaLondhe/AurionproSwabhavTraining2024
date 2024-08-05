package com.aurionpro.creational.abstractfactory.model;

public class CurrentAccount implements IAccount{
	private long accountNumber;
	private String name;
	private double balance;
	private double OVERDRAFT_LIMIT;
	public CurrentAccount(long accountNumber, String name, double balance, double oVERDRAFT_LIMIT) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		OVERDRAFT_LIMIT = oVERDRAFT_LIMIT;
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
	public double getOVERDRAFT_LIMIT() {
		return OVERDRAFT_LIMIT;
	}
	public void setOVERDRAFT_LIMIT(double oVERDRAFT_LIMIT) {
		OVERDRAFT_LIMIT = oVERDRAFT_LIMIT;
	}
	@Override
	public void credit(double amount) {
		if(amount<=0) {
			System.out.println("Please enter a valid amount");
			return;
		}
		
		balance += amount;
		System.out.println("Amount creditted successfully. Your updated balance is Rs. " + balance);
	}
	private double overdraft = (balance+OVERDRAFT_LIMIT);
	@Override
	public void debit(double amount) {
		// TODO Auto-generated method stub
		if(amount> (balance+OVERDRAFT_LIMIT)) {
			System.out.println("You are exceeding your overdraft limit and balance!");
			return;
		}
		if(balance < amount && amount < overdraft) {
			balance -=amount;
			System.out.println("You are utilizing your overdraft limit. Your balance is " + balance);
			overdraft -= amount;
			return;
		} 
		balance -=amount;
		System.out.println("Amount debitted successfully! The new balance is " + balance);
		
	}
	
	
}
