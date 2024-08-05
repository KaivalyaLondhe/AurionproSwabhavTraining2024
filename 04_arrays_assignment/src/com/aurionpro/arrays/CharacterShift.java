package com.aurionpro.arrays;

import java.util.Scanner;

public class CharacterShift {
	public static String shiftCharacters(String input, int n) {
		if (input == null || input.isEmpty()) {
			return input; 
		}

		char[] chars = input.toCharArray();
		int len = chars.length;

		for (int i = 0; i < len; i++) {
			char c = chars[i];
			if (Character.isLetter(c)) {
				char base = Character.isUpperCase(c) ? 'A' : 'a';
				chars[i] = (char) (base + (c - base + n) % 26);
			}
		}

		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		System.out.print("Enter the shift value (n): ");
		int n = scanner.nextInt();

		String shiftedOutput = shiftCharacters(input, n);
		System.out.println("Shifted output: " + shiftedOutput);
	}
}
