package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.model.Account;

public class AccountTest {
	static Scanner scanner = new Scanner(System.in);

	private static void accountCreation() {

		System.out.print("For account creation, your account number is: ");
		Random random = new Random();
		long accountNumber = (long) (Math.random() * Math.pow(10, 10));
		System.out.println(accountNumber);
		System.out.println("\n");
		System.out.println("Please enter your name");
		String name = scanner.next();
		System.out.println("Please enter your balance");
		double balance = scanner.nextDouble();
		Account account = new Account(accountNumber, name, balance);
		menu(account);
	}

	private static void menu(Account account) {
		System.out.println("Choose what you wanna do today.");
		System.out.println("Press 1 for Credit 2 for Debit");
		int choice = scanner.nextInt();
		creditDebitSwitch(choice, account);
	}

	private static void creditDebitSwitch(int choice, Account account) {
		switch (choice) {
		case 1:
			System.out.println("Enter the amount you wish to credit");
			int amount = scanner.nextInt();
			account.credit(amount);
			break;
		case 2:
			try {
				System.out.println("Enter the amount you wish to debit");
				amount = scanner.nextInt();
				account.debit(amount);
				System.out.println(account.getBalance());
			} catch (InsufficientBalanceException exception) {
				System.out.println(exception.getMessage());
			}
			break;
		}
	}

	public static void main(String[] args) {

		accountCreation();

	}
}
