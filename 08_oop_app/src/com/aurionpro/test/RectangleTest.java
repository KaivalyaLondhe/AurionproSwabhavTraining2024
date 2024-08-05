package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		Rectangle rectangle = new Rectangle();
//		System.out.println("Enter the height of Rectangle");
//		int height = scanner.nextInt();
//		System.out.println("Enter the width of Rectangle");
//		int width = scanner.nextInt();
//
//		rectangle.setHeight(height);
//		rectangle.setWidth(width);
//		System.out.println("Height:" +rectangle.getHeight());
//		System.out.println("Width:" +rectangle.getWidth());
//		rectangle.area(height, width);
//
//		System.out.println("Enter the height of Second Rectangle");
//		Rectangle rectangle2 = new Rectangle();
//		int height2 = scanner.nextInt();
//		System.out.println("Enter the width of Rectangle");
//		int width2 = scanner.nextInt();
//
//		rectangle2.setHeight(height2);
//		rectangle2.setWidth(width2);
//		System.out.println("Height:" +rectangle2.getHeight());
//		System.out.println("Width:" +rectangle2.getWidth());
//		rectangle2.area(height2, width2);
		
		Rectangle rectangle3 = new Rectangle();
		System.out.println("Height: " + rectangle3.getHeight());
		System.out.println("Width: " + rectangle3.getWidth());
		rectangle3.area(rectangle3.getHeight(), rectangle3.getWidth());

	}
}
