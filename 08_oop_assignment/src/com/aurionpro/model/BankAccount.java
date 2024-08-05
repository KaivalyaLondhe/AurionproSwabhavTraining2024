package com.aurionpro.model;

public class BankAccount {
	private long accountNumber;
	private String name;
	private double balance;
	private AccountType accountType;
	
	public BankAccount() {
		accountNumber =(long)1000000000;
		name = "User";
		balance = 1000;
	}
	public BankAccount(long enteredAccountNumber, String enteredName, double enteredBalance) {
		accountNumber = enteredAccountNumber;
		name = enteredName;
		balance = enteredBalance;
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

	public void credit(int amount) {
		if(amount<0) {
			System.err.println("Please enter a valid amount");
		}else {
		balance += amount;
		System.out.println("Amount Creditted successfully. Your updated balance is: " + balance);
		}
	}

	public void debit(int amount) {
		if (balance < amount) {
			System.err.println("You have insufficient balance in your account");
		} else {
			balance -= amount;
			System.out.println("Amount Debitted successfully. Your updated balance is: " + balance);
		}
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}

}
