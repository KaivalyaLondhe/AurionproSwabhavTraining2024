package com.aurionpro.test;
import java.util.Scanner;
public class HelloWorld {
	public static int Add(int num1, int num2) {
		int sum;
		sum = num1+num2;
		System.out.println("The sum of the two numbers is: " + sum);
		return sum;
		
	}
	public static int Subtract(int num1, int num2) {
		int sum;
		sum = num1-num2;
		System.out.println("The subtraction of the two numbers is: " + sum);
		return sum;
		
	}
	public static int Multiply(int num1, int num2) {
		int sum;
		sum = num1*num2;
		System.out.println("The multiplication of the two numbers is: " + sum);
		return sum;
		
	}
	public static int Divide(int num1, int num2) {
		int sum;
		sum = num1/num2;
		System.out.println("The division of the two numbers is: " + sum);
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int operation = Integer.parseInt(args[2]);
		switch (operation) {
		case 1:
			HelloWorld.Add(first, second);
			break;
		case 2:
			HelloWorld.Subtract(first, second);
			break;
		case 3:
			HelloWorld.Multiply(first, second);
			break;
		case 4:
			HelloWorld.Divide(first, second);
			break;
		}
		
}
}
