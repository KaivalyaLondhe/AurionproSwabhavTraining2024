package com.aurionpro.iterative.test;

public class SumOfFirstHundredNumbers {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of first 100 numbers is " + sum);
	}
}
