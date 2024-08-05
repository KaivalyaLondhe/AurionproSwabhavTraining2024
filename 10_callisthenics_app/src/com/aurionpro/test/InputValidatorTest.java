package com.aurionpro.test;

import java.util.Scanner;

public class InputValidatorTest {
	static Scanner scanner = new Scanner(System.in);

	private static void inputDetails() {

		System.out.print("Enter Username: \t");
		String userName = scanner.next();
		checkUsername(userName);
		System.out.print("Enter password: \t");
		String password = scanner.next();
		checkPassword(password);
		System.out.println("Enter EmailId: \t");
		String email = scanner.next();
		checkEmail(email);
	}

	private static void calculate(String input, int minimumLength, int maximumLength) {
		if (input.length() < minimumLength || input.length() > maximumLength) {
			System.out.println(input + " is invalid");
			return;
		}
		System.out.println(input + " input is valid.");
	}

	private static void checkUsername(String userName) {
		calculate(userName, 3, 20);

	}

	private static void checkPassword(String password) {
		calculate(password, 8, 30);
	}

	private static void checkEmail(String email) {
		calculate(email, 5, 50);
		boolean contains = email.contains("@") && email.contains(".");
		if (!contains) {
			System.out.println("The input email is invalid. It should contail @ and .");
			return;
		}
		System.out.println("Entered email is valid");
	}

	public static void main(String[] args) {
		System.out.println("Please enter details you wish to validate");
		inputDetails();
	}
}
