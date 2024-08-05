package com.aurionpro.model;
import java.util.Scanner;

public class HomeworkCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int operation;
		int answer;
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		System.out.println("Select the operation you would like to perform: 1 Addition , 2 Subtraction 3 Multiplication , 4 Division");
		operation=sc.nextInt();
		switch(operation) {
		case 1:
			answer = num1+num2;
			System.out.println("The addition of the two numbers " + num1 + " + " + num2 + " is " + answer);
			break;
		
		case 2:
			answer = num1-num2;
			System.out.println("The subtraction of the two numbers " + num1 + " + " + num2 + " is " + answer);
			break;
		case 3:
			answer=num1*num2;
			System.out.println("The multiplication of the two numbers " + num1 + " + " + num2 + " is " + answer);
			break;
		case 4:
			answer=num1/num2;
			System.out.println("The division of the two numbers " + num1 + " + " + num2 + " is " + answer);
			break;
		}
	}
}
