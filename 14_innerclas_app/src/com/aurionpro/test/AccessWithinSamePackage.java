package com.aurionpro.test;

public class AccessWithinSamePackage extends AccessSpecifiers {
	public void accessVariables(){
		 // System.out.println(privateVar);   // Cannot access private variable from subclass
        System.out.println(defaultVar);   
        System.out.println(protectedVar); 
        System.out.println(publicVar);  
	}
}
