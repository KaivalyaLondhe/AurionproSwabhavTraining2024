package com.aurionpro.creational.abstractfactory.model;

public class CurrentAccountFactory implements IAccountFactory{

	@Override
	public IAccount makeAccount(long accountNumber, String name, double balance, double OVERDRAFT_LIMIT) {
		// TODO Auto-generated method stub
		return new CurrentAccount(accountNumber, name, balance, OVERDRAFT_LIMIT);
	}

}
