package com.aurionpro.test;

public class OuterClass {

	int number = 6;
	
	public void print() {
		class localInnerClass() {
			
		}
		
		System.out.println("This is outer class");
	}
	public class innerClass{ // Non static inner class
		int number = 10;
		
		public void print() {
			System.out.println("This is inner class");
		}
	}
	public static class innerClass2{ //can be created without creating object of inner class
		int number = 20;
		public void print() {
			
			System.out.println("This is static inner class");
		}
	}
}
