package com.aurionpro.model;

import com.aurionpro.exceptions.overOverDraftLimitException;

public class CurrentAccount extends Account {

	private double OVER_DRAFT_LIMIT = 5000;
	private double OVER_DRAFT;

	public CurrentAccount(long accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub

	}

	public double getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}

	public void setOVER_DRAFT_LIMIT(double oVER_DRAFT_LIMIT) {
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}

	public double getOVER_DRAFT() {
		return OVER_DRAFT;
	}

	public void setOVER_DRAFT(double oVER_DRAFT) {
		OVER_DRAFT = oVER_DRAFT;
	}

	public void credit(double credit) {
		if (credit <= 0) {
			System.err.println("Please enter an amount greater than 0");
			return;
		}
		setBalance(getBalance() + credit);
	}

	public void debit(double debit) {
		if (debit <= 0) {
			System.err.println("Please enter a valid amount \n");
			return;
		}
		if (debit > (getBalance() + OVER_DRAFT_LIMIT)) {
			throw new overOverDraftLimitException(debit);
		}
		setBalance(getBalance() - debit);
		double limit = (getBalance() + OVER_DRAFT_LIMIT);
		// System.out.println(limit);
		setOVER_DRAFT(limit);
		if (getOVER_DRAFT() > 0) {
			System.out.println("You are using your OVER_DRAFT_LIMIT for withdrawing this amount. The amount due is Rs."
					+ getOVER_DRAFT());
			System.out.println("Amount debitted successfully");
			return;
		}
		System.out.println("Amount debitted successfully.");
	}

	public void display() {
		System.out.println("The account details are: \n");
	}

	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", OVER_DRAFT_DUE=" + OVER_DRAFT
				+ ", Account Number =" + getAccountNumber() + ", Name =" + getName() + ", Balance =" + getBalance()
				+ "]";
	}

}
