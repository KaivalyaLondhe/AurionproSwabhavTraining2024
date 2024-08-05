package com.aurionpro.model;

public class CurrentAccount extends Account{
	private double OVER_DRAFT_LIMIT;
	public CurrentAccount(int accountNumber, String name, double balance, double OVER_DRAFT_LIMIT) {
		super(accountNumber, name, balance);
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
		// TODO Auto-generated constructor stub
	}
	public double getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}
	public void setOVER_DRAFT_LIMIT(double oVER_DRAFT_LIMIT) {
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}
	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
	

	
	
}
