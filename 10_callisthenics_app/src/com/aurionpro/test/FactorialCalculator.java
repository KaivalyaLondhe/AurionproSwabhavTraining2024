package com.aurionpro.test;

import java.util.Scanner;

public class FactorialCalculator {
	private static int calculateFactorial(int number) {
		if (number == 0)
			return 1;
		if (number < 0)
			return -1;
		int fact = 1;
		for (int i = 0; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int factorial = calculateFactorial(number);	
		if (factorial == -1) {
			System.out.println("Cannot calculate factorial of negative number.");
			return;
		}
		System.out.println("Factorial is " + factorial);
	}
}
