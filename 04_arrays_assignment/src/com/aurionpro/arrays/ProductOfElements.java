package com.aurionpro.arrays;

import java.util.Scanner;

public class ProductOfElements {
	static Scanner scanner = new Scanner(System.in);

	private static int[] inputArray(int size) {
		int inputArray[] = new int[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scanner.nextInt();
		}
		return inputArray;
	}

	private static int[] productArray(int[] inputArray) {
		int[] productArray = new int[inputArray.length];
		int product = 1;
		for (int i = 0; i < inputArray.length; i++)
			product *= inputArray[i];
		for (int i = 0; i < productArray.length; i++) {
			productArray[i] = product / inputArray[i];
		}
		for (int i = 0; i < productArray.length; i++) {
			System.out.print(productArray[i] + "\t");
		}
		return productArray;
	}

	public static void main(String[] args) {
		System.out.print("Enter the length of your array: ");
		int size = scanner.nextInt();
		int inputArray[] = inputArray(size);

		System.out.println("Your original array is");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + "\t");
		}

		System.out.println("");
		System.out.println("Your product array is");
		productArray(inputArray);

	}
}
