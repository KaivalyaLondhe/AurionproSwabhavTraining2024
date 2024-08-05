package com.aurionpro.model;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private AccountType accountType;

	public Account(long accountNumber, String name, double balance, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
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

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void credit(int amount) {
		if (amount < 0) {
			System.err.println("Please enter a valid amount to deposit");
			return;
		} 
			this.balance += amount;
			System.out.println("Amount creditted successfully! The new available balance is: " + getBalance());

	}

	public void debit(int amount) {
		if (amount > balance) {
			System.err.println("Insufficient balance!");
			return;
		} 
			this.balance -= amount;
			System.out.println("Amount debitted successfully! The new available balance is: " + getBalance());

	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", accountType="
				+ accountType + "]";
	}
}
