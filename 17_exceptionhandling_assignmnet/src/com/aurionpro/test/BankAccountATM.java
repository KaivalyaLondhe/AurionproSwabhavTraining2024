package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exceptions.overOverDraftLimitException;
import com.aurionpro.model.*;

import com.aurionpro.model.SavingsAccount;

public class BankAccountATM {
	static Scanner scanner = new Scanner(System.in);

	public static void welcome() {
		System.out.println("----------------------");
		System.out.println("Welcome to ICICI BANK!");
		System.out.println("----------------------");
		System.out.println("Select what you want to do today!");
	}

	public static void createAccount() {
		System.out.print("Please enter your name:  ");
		String name = scanner.next();
		System.out.println("Please enter your balance :  ");
		double balance = scanner.nextDouble();
		Random random = new Random();
		long accountNumber = (long) (Math.random() * Math.pow(10, 10));
		System.out.println("Choose account type: 1. Savings Account, 2. Current Account");
		int choiceAccount = scanner.nextInt();
		displayMenu(choiceAccount, balance, name, accountNumber);

	}

	public static void displayMenu(int choiceAccount, double balance, String name, long accountNumber) {
		switch (choiceAccount) {
		case 1:
			SavingsAccount savingsAccount = new SavingsAccount(accountNumber, name, balance);
			System.out.println(savingsAccount);
			menuSelectionForSavings(savingsAccount);
			break;
		case 2:
			CurrentAccount currentAccount = new CurrentAccount(accountNumber, name, balance);
			System.out.println(currentAccount);
			menuSelectionForCurrent(currentAccount);
			break;
		}
	}

	public static void menuSelectionForSavings(SavingsAccount savingsAccount) {
		int option;
		do {
			innerMenu();
			option = scanner.nextInt();
			switchForSavings(option, savingsAccount);
		} while (!(option == 4));
		System.out.println("Thank you for using our services!");
		menu();

	}

	public static void menuSelectionForCurrent(CurrentAccount currentAccount) {
		int option;
		do {
			innerMenu();
			option = scanner.nextInt();
			switchForCurrent(option, currentAccount);
		} while (!(option == 4));
		System.out.println("Thank you for using our services!");
		menu();
	}

	public static void innerMenu() {
		System.out.println("1. Check Balance");
		System.out.println("2. Credit");
		System.out.println("3. Debit");
		System.out.println("4. Exit");
	}

	private static void switchForCurrent(int option, CurrentAccount currentAccount) {

		switch (option) {
		case 1:
			System.out.println("The available balance in your account is Rs. " + currentAccount.getBalance());

			break;
		case 2:
			System.out.println("Please enter the amount you wish to credit");
			double credit = scanner.nextDouble();
			currentAccount.credit(credit);
			break;
		case 3:
			try {
			System.out.println("Please enter the amount you wish to debit.");
			double debit = scanner.nextDouble();
			currentAccount.debit(debit);
			}
			catch(overOverDraftLimitException exception) {
				System.out.println(exception.getMessage());
			}
			break;

		}

	}

	private static void switchForSavings(int option, SavingsAccount savingsAccount) {

		switch (option) {
		case 1:
			System.out.println("The available balance in your account is Rs. " + savingsAccount.getBalance());
			if (savingsAccount.getBalance() < savingsAccount.getMIN_BALANCE()) {
				System.out.println(
						"Your current available balance is lower than minimum balance please credit to avoid charges. \n Minimum Balance is Rs. "
								+ savingsAccount.getMIN_BALANCE());
			}
			break;
		case 2:
			System.out.println("Please enter the amount you wish to credit");
			double credit = scanner.nextDouble();
			savingsAccount.credit(credit);
			break;
		case 3:
			System.out.println("Please enter the amount you wish to debit.");
			double debit = scanner.nextDouble();
			savingsAccount.debit(debit);
			break;

		}

	}

	public static void menu() {
		welcome();
		int option;
		do {
			System.out.println("1. Create an Account.");
			System.out.println("2. Exit");
			option = scanner.nextInt();
			if (option == 1) {
				createAccount();
			}
		} while (!(option == 2));
		System.out.println("Thank you for using our services");
		System.exit(option);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();

	}

}
