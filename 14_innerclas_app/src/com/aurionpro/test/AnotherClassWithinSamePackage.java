package com.aurionpro.test;

public class AnotherClassWithinSamePackage {
	public void accessVariables() {
		AccessSpecifiers accessSpecifiers = new AccessSpecifiers();
		 // System.out.println(accessSpecifiers.privateVar);   // Cannot access private variable from another class
        System.out.println(accessSpecifiers.defaultVar);  
        System.out.println(accessSpecifiers.protectedVar); 
        System.out.println(accessSpecifiers.publicVar); 
	}
}
