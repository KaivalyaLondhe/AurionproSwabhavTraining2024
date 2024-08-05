package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {
	static Scanner scanner = new Scanner(System.in);

	private static void menu(BankAccount bankAccount) {
		int option;
		System.out.println("Welcome! " + bankAccount.getName() + " account number: " + bankAccount.getAccountNumber());

		do {
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.println("Please choose an option: ");

			option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Your current Balance is: $" + bankAccount.getBalance());
				break;

			case 2:
				System.out.print("Enter amount to deposit: ");
				int deposit = scanner.nextInt();
				bankAccount.credit(deposit);
				System.out.println(
						"You have deposited $" + deposit + ". Your new balance is $" + bankAccount.getBalance());
				break;

			case 3:
				System.out.print("Enter amount to withdraw: ");
				int withdraw = scanner.nextInt();
				bankAccount.debit(withdraw);
				break;

			case 4:
				System.out.println("Thank you for using ICICI Bank!");
				break;
			

			default:
				System.out.println("Invalid input. Please select a correct option.");
			}
		} while (option != 4);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to ICICI Bank");

		BankAccount bankAccount1 = new BankAccount();

		System.out.print("Please enter your name: ");
		String name = scanner.next();
		bankAccount1.setName(name);

		Random random = new Random();
		int balance = random.nextInt(1000000) + 1;
		bankAccount1.setBalance(balance);

		random = new Random();
		long accountNumber = (long) (Math.random() * Math.pow(10, 10));
		bankAccount1.setAccountNumber(accountNumber);

		System.out.println("Congradulations your account has been successfully created!");

		menu(bankAccount1);

		System.out.println("Do you wish to check for another account? Press 1 for Yes, Press 2 for No");

		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println("Welcome to ICICI Bank");

			BankAccount bankAccount2 = new BankAccount();

			System.out.print("Please enter your name: ");
			name = scanner.next();
			bankAccount2.setName(name);

			random = new Random();
			balance = random.nextInt(1000000) + 1;
			bankAccount2.setBalance(balance);

			accountNumber = (long) (Math.random() * Math.pow(10, 10));
			bankAccount2.setAccountNumber(accountNumber);

			System.out.println("Congradulations your account has been successfully created!");

			menu(bankAccount2);

		} else {
			System.out.println("Thank you for using our services!");
			return;
		}

	}
}
