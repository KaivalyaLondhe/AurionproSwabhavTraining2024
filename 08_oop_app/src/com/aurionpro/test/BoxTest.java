package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BoxTest {
	public static void main(String[] args) {
		Box box1 = new Box();
		
		System.out.println("Height is: " +box1.getHeight());
		System.out.println("Width is: " +box1.getWidth());
		System.out.println("Depth is: " +box1.getDepth());
		
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter depth:");
		int depth = scanner.nextInt();
		System.out.println("Enter height:");
		int height = scanner.nextInt();
		System.out.println("Enter width:");
		int width = scanner.nextInt();
		Box box2 = new Box(width ,height, depth);
		
		
		System.out.println("Height is: " +box2.getHeight());
		System.out.println("Width is: " +box2.getWidth());
		System.out.println("Depth is: " +box2.getDepth());
		
	
	
	}
}
