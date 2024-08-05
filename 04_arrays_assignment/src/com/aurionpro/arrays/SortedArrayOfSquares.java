package com.aurionpro.arrays;

import java.util.*;

public class SortedArrayOfSquares {

	public static int[] sortedSquares(int[] numbers) {
		int size = numbers.length;
		int[] result = new int[size];
		int left = 0;
		int right = size - 1;
		int pointer = size - 1;

		while (left <= right) {
			int leftSquare = numbers[left] * numbers[left];
			int rightSquare = numbers[right] * numbers[right];

			if (leftSquare > rightSquare) {
				result[pointer] = leftSquare;
				left++;
			} else {
				result[pointer] = rightSquare;
				right--;
			}
			pointer--;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] inputArray = new int[size];
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			inputArray[i] = scanner.nextInt();
		}

		int[] squaredArray = sortedSquares(inputArray);

		System.out.print("Sorted Squared Array: " + Arrays.toString(squaredArray));
	}
}
