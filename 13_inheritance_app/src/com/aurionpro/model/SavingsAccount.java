package com.aurionpro.model;

public class SavingsAccount extends Account{
	private double MINIMUM_BALANCE;
	public SavingsAccount(int accountNumber, String name, double balance, double MINIMUM_BALANCE) {
		super(accountNumber, name, balance);
		this.MINIMUM_BALANCE = MINIMUM_BALANCE;
		// TODO Auto-generated constructor stub
	}
	public double getMINIMUM_BALANCE() {
		return MINIMUM_BALANCE;
	}
	public void setMINIMUM_BALANCE(double mINIMUM_BALANCE) {
		MINIMUM_BALANCE = mINIMUM_BALANCE;
	}
	@Override
	public String toString() {
		return "SavingsAccount [MINIMUM_BALANCE=" + MINIMUM_BALANCE + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}

	
}
