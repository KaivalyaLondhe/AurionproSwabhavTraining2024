package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
	static Scanner scanner = new Scanner(System.in);

	private static void accountCreation(int numberOfAccounts, Account[] accounts) {

		for (int i = 0; i < numberOfAccounts; i++) {
			Random random = new Random();
			long accountNumber = (long) (Math.random() * Math.pow(10, 10));
			System.out.println("Your randomly generated account number is: " + accountNumber);
			System.out.print("Please enter your name: ");
			String name = scanner.next();
			System.out.print("Please enter your balance: ");
			double balance = scanner.nextDouble();
			System.out.println(
					"Please choose your account type. 1 for Savings account, 2 for Current account, 3 for Loan account");

			int accountTypeChoice = scanner.nextInt();
			accountTypeChoice(accountTypeChoice, accounts, i, accountNumber, name, balance);
		}

	}

	private static void accountTypeChoice(int accountTypeChoice, Account[] accounts, int i, long accountNumber,
			String name, double balance) {
		switch (accountTypeChoice) {
		case 1: {
			accounts[i] = new Account(accountNumber, name, balance, AccountType.SAVINGS);
			return;
		}
		case 2: {
			accounts[i] = new Account(accountNumber, name, balance, AccountType.CURRENT);
			return;
		}
		case 3: {
			accounts[i] = new Account(accountNumber, name, balance, AccountType.LOAN);
			return;
		}
		}
	}

	private static void menu(Account[] accounts) {
		System.out.println("Please select which account you want to perform operations on: (Enter only index) ");
		int counter = 1;
		for (Account account : accounts) {
			System.out.print("\t " + counter + ". ");
			System.out.print(account.getAccountNumber());
			counter++;
		}
		System.out.println("");
		int choice = scanner.nextInt();
		System.out.println("Great! Showing options for account number: " + accounts[choice - 1].getAccountNumber());
		System.out.println("1. Debit");
		System.out.println("2. Credit");
		int transactionChoice = scanner.nextInt();
		if (transactionChoice == 1) {
			System.out.println("Please enter amount which you would like to withdraw. Current Available balance is "
					+ accounts[choice - 1].getBalance());
			int amount = scanner.nextInt();
			accounts[choice - 1].debit(amount);
			menu(accounts);
			return;
		}
		if (transactionChoice == 2) {
			System.out.println("Please enter amount which you would like to deposit. Current Available balance is "
					+ accounts[choice - 1].getBalance());
			int amount = scanner.nextInt();
			accounts[choice - 1].credit(amount);
			menu(accounts);
			return;
		}
	}

	private static void getMaximumBalanceAccount(Account[] accounts) {
		double maximumBalance = 0;
		int temp = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maximumBalance) {
				maximumBalance = accounts[i].getBalance();
				temp = i;
			}
		}
		System.out.println("The account with maximum balance of Rs: " + accounts[temp].getBalance() + " is: ");
		System.out.println("Account No: " + accounts[temp].getAccountNumber() + " \t Name: " + accounts[temp].getName()
				+ "\t Type of Account: " + accounts[temp].getAccountType());
	}

	public static void main(String[] args) {
		System.out.print("Enter the number of accounts you wish to create: ");

		int numberOfAccounts = scanner.nextInt();
		Account accounts[] = new Account[numberOfAccounts];
		accountCreation(numberOfAccounts, accounts);
		getMaximumBalanceAccount(accounts);
		menu(accounts);

	}
}
