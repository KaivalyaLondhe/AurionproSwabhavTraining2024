package com.aurionpro.model;

public class Operations {
	public int addition(int number1, int number2) {
		return number1+number2;
	}
	public int subtraction(int number1, int number2) {
		return number1-number2;
	}
	public int mulitplication(int number1, int number2) {
		return number1*number2;
	}
	public int division(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException();
		return number1/number2;
	}

}