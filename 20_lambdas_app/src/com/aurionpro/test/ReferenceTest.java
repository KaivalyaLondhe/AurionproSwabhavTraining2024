package com.aurionpro.test;

import com.aurionpro.model.ITest;

public class ReferenceTest {
	public static void main(String[] args) {
		ITest test = Reference::new; // For constructors
		methodDisplay(test);
		ITest test1 = Reference::staticPrint; // For static methods
		methodDisplay(test1);
		
		//Now for non static methods
		Reference reference = new Reference();
		ITest test2 = reference::print;
		methodDisplay(test2);
		
		
	}
	private static void methodDisplay(ITest test) {
		test.display();
	}
}
