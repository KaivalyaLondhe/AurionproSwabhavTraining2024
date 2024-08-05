package com.aurionpro.test;
import java.util.Scanner;
public class Swapper2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int number1=Integer.parseInt(args[0]);

		System.out.print("Enter second number : ");
		int number2=Integer.parseInt(args[1]);
		System.out.println("The two numbers before were: a "+number1+" and b "+ number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("The two numbers now are: a "+number1+ " and b "+number2);
	}
}
