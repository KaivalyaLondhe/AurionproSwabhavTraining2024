package com.aurionpro.arrays;

import java.util.Scanner;

public class PeakElement {
	public static int[] findPeakElements(int[] nums) {
		int n = nums.length;
		int[] peaks = new int[n];
		int peakCount = 0;

		if (n == 0) {

			return new int[0];
		}

		if (nums[0] >= nums[1]) {
			peaks[peakCount++] = nums[0];
		}

		for (int i = 1; i < n - 1; i++) {
			if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
				peaks[peakCount++] = nums[i];
			}
		}

		if (nums[n - 1] >= nums[n - 2]) {
			peaks[peakCount++] = nums[n - 1];
		}

		int[] result = new int[peakCount];
		System.arraycopy(peaks, 0, result, 0, peakCount);
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int[] inputArray = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			inputArray[i] = scanner.nextInt();
		}

		int[] peakElements = findPeakElements(inputArray);

		if (peakElements.length == 0) {
			System.out.println("No peak elements found.");
		} else {
			System.out.print("Peak elements: ");
			for (int peak : peakElements) {
				System.out.print(peak + " ");
			}
			System.out.println();
		}
	}
}
