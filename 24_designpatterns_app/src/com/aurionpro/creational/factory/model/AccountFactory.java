package com.aurionpro.creational.factory.model;

public class AccountFactory {
	public static IAccount accountFactory(long accountNumber, String name, double balance,double minimumBalance, AccountType accountType) {
		switch(accountType)
		{
		case SAVINGS_ACCOUNT:
			return new SavingsAccount(accountNumber, name, balance, minimumBalance);
		case CURRENT_ACCOUNT:
			return new CurrentAccount(accountNumber, name, balance);
		
		}
		return null;
	}
}
