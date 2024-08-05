package com.aurionpro.test;

import com.aurionpro.model.ISayable;

public class ISayableTest {
	public static void main(String[] args) {
//		ISayable sayable = new ISayable() {
//
//			@Override
//			public void say() {
//				System.out.println("Hi this is implemented without creating a class");
//				
//			}
//			
//		};
		ISayable sayable = () -> System.out.println("Hello this is lambda expression"); // this means that we can save calling of a method to a variable
		passingToThisMethod(sayable);
		sayable.say();
		
	}
	private static void passingToThisMethod(ISayable sayable) {
		System.out.println("Hello it has been passed to this as an variable");
	}
}
