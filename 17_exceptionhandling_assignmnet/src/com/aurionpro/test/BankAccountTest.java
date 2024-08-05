package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exceptions.BankExceptions;
import com.aurionpro.model.BankAccount;

public class BankAccountTest {
	static Scanner scanner = new Scanner(System.in);

	public static void welcome() {
		System.out.println("----------------------");
		System.out.println("Welcome to ICICI BANK!");
		System.out.println("----------------------");
		System.out.println("Select what you want to do today!");
	}

	public static void createAccount(ArrayList<BankAccount> bankAccounts) {
		long accountNumber = (long) (Math.random() * Math.pow(10, 10));
		System.out.println("Your randomly generated account number is: " + accountNumber);
		System.out.print("Please enter your name:  ");
		String name = scanner.next();
		System.out.println("Please enter your balance :  ");
		double balance = scanner.nextDouble();
		Random random = new Random();
		bankAccounts.add(new BankAccount(accountNumber, name, balance));
		mulitpleAccountsCreation(bankAccounts);

	}

	public static void mulitpleAccountsCreation(ArrayList<BankAccount> bankAccounts) {
		System.out.println("Would you like to create another account? Press 1 for yes 2 for no");
		int input = scanner.nextInt();

		if (input == 1) {
			createAccount(bankAccounts);
		}
		if (input == 2) {
			System.out.println("Choose an account you want to perform actions on: ");
			int counter = 1;
			for (BankAccount bankAccount : bankAccounts) {
				System.out.println(counter + ". " + bankAccount.getAccountNumber() + " " + bankAccount.getName());
				counter++;
			}
			accountSelection(bankAccounts);
		}

	}

	public static void accountSelection(ArrayList<BankAccount> bankAccounts) {
		int choice = scanner.nextInt();
		int selection = 0;
		operationSelection(choice, selection, bankAccounts);
	}

	public static void operationSelection(int choice, int selection, ArrayList<BankAccount> bankAccounts) {

		System.out.println("Select which operation you wish to perform. 1. Credit, 2. Debit");
		try {
			selection = scanner.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Enter the amount you wish to credit");
				int amount = scanner.nextInt();
				bankAccounts.get(choice - 1).deposit(amount);
				break;
			case 2:
				System.out.println("Enter the amount you wish to debit");
				amount = scanner.nextInt();
				bankAccounts.get(choice - 1).withdraw(amount);
				break;
			default:
				System.out.println("Please enter a valid input");
				operationSelection(choice, selection, bankAccounts);
				break;
			}
		} catch (BankExceptions.NegativeAmountException exception) {
			System.out.println(exception.getMessage());
		} catch (BankExceptions.InsufficientFundsExcpetion exception) {
			System.out.println(exception.getMessage());
		}

	}

	public static void menu(ArrayList<BankAccount> bankAccounts) {
		welcome();
		int option;
		do {
			System.out.println("1. Create an Account.");
			System.out.println("2. Exit");
			option = scanner.nextInt();
			if (option == 1) {
				createAccount(bankAccounts);
			}
		} while (!(option == 2));
		System.out.println("Thank you for using our services");
		System.exit(option);
	}

	public static void main(String[] args) {
		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

		// TODO Auto-generated method stub
		menu(bankAccounts);
	}

}
