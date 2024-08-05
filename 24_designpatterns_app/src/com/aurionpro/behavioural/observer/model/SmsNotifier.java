package com.aurionpro.behavioural.observer.model;

public class SmsNotifier implements INotifier{

	@Override
	public void notify(Account account) {
		// TODO Auto-generated method stub
		System.out.println( account.getOperation() + " operation performed successfully. The availabe balance is " + account.getBalance());
	}
	
}
