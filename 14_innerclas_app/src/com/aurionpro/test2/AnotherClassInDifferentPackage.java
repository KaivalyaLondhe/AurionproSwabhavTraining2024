package com.aurionpro.test2;

import com.aurionpro.test.AccessSpecifiers;

public class AnotherClassInDifferentPackage {
	
	public void accessVariables() {
		AccessSpecifiers accessSpecifiers = new AccessSpecifiers();
		
	        // System.out.println(accessSpecifiers.privateVar);   // Cannot access private variable from another class in different package
	        // System.out.println(accessSpecifiers.defaultVar);   // Cannot access default variable from another class in different package
	        // System.out.println(accessSpecifiers.protectedVar); // Cannot access protected variable from another class in different package
	        System.out.println(accessSpecifiers.publicVar);   
	}
}
