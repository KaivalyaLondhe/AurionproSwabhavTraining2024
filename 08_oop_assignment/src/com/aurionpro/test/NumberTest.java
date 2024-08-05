package com.aurionpro.test;

import com.aurionpro.model.Number;
public class NumberTest {
	public static void main(String[] args) {
		Number number1 = new Number(20);
		Number number2 = new Number(30);
		System.out.println("Before swapping the numbers are: Number1: "+ number1.getNumber() + "\t Number2: "+ number2.getNumber());
		
		swap(number1, number2);
		
		System.out.println("After swapping the numbers are: Number1: "+ number1.getNumber() + "\t Number2: " + number2.getNumber());
		

	}
	private static void swap(Number number1, Number number2) {
		int temp = number1.getNumber();
		number1.setNumber(number2.getNumber()); 
		number2.setNumber(temp);
		
	}
	
	
}
