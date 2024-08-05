package com.aurionpro.behavioural.observer.model;

public class AppNotifier implements INotifier{

	@Override
	public void notify(Account account) {
		// TODO Auto-generated method stub
		System.err.println(account.getOperation() + " operation performmed successfully. The available balance is " + account.getBalance());
	}
	

}
