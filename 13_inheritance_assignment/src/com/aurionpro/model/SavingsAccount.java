package com.aurionpro.model;

public class SavingsAccount extends Account {
	private static double MIN_BALANCE = 10000;

	public SavingsAccount(long accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		SavingsAccount.MIN_BALANCE = 10000;
		// TODO Auto-generated constructor stub
	}

	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(double mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}

	public void credit(double credit) {
		if (credit <= 0) {
			System.err.println("Please enter valid amount");
			return;
		}

		setBalance(getBalance() + credit);
		System.out.println("Amount creditted successfully! Your new balance is Rs. " + getBalance());
		if (getBalance() < MIN_BALANCE) {
			System.out.println(
					"WARNING! Balance available is below minimum balance please maintain minimum balance to avoid any charges. \n");
		}
	}

	public void debit(double debit) {
		if (debit <= 0) {
			System.err.println("please enter valid amount");
			return;
		}
		if (debit > getBalance()) {
			System.err.println("Insufficient Balance!");
			return;
		}
		if (getBalance() - debit < MIN_BALANCE) {
			System.out.println(
					"Amount debitted successfully. Your balance is now below minimum balance criteria. Please maintain your minimum balance to avoid any charges. \n");
			setBalance(getBalance() - debit);
			System.out.println("Available remaining balance is " + getBalance());
			return;
		}
		setBalance(getBalance() - debit);
		System.out.println("Amount debitted successfully. Your available balance is Rs. " + getBalance());
	}

	@Override
	public String toString() {
		return "SavingsAccount [MIN_BALANCE=" + MIN_BALANCE + ", Account Number =" + getAccountNumber() + ", Name ="
				+ getName() + ", Balance =" + getBalance() + "]";
	}

}
