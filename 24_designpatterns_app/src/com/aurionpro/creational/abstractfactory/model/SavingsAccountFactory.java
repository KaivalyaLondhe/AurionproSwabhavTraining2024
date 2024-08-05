package com.aurionpro.creational.abstractfactory.model;



public class SavingsAccountFactory implements IAccountFactory{

	

	@Override
	public IAccount makeAccount(long accountNumber, String name, double balance, double minimumBalance) {
		// TODO Auto-generated method stub
		return 
	}

	@Override
	public IAccount makeAccount(long accountNumber, String name, double balance, AccountType x) {
		// TODO Auto-generated method stub
		return new SavingsAccount(accountNumber, name, balance, minimumBalance);;
	}

}
