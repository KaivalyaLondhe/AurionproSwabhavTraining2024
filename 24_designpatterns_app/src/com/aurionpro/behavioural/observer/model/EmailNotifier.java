package com.aurionpro.behavioural.observer.model;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account.getOperation() + " operation was performmed successfully. Your available balance is " + account.getBalance());
	}

}
