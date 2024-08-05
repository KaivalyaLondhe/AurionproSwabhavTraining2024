package com.aurionpro.test;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double divison = number1 / number2;

			System.out.println("Divison is " + divison);
		} catch (ArithmeticException exception) {
			System.out.println("Number 2 cannot be zero as we cannot divide any number by 0");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Division requires two arguments please provide two arguements.");
		} catch (NumberFormatException exception) {
			System.out.println("Please enter a valid number number cannot be a character");
		} catch (Exception exception) {
			System.out.println("Exception occured");
		} finally {
			System.out.println("This will always execute");
		}
		System.out.println("Exit");

	}
}
