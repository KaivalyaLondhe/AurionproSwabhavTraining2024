package com.aurionpro.test2;
import com.aurionpro.test.*;

public class SubClassInDIfferentPackage extends AccessSpecifiers {
	
	 public void accessVariables() {
	        // System.out.println(privateVar);   // Cannot access private variable from subclass in different package
	        // System.out.println(defaultVar);   // Cannot access default variable from subclass in different package
	        System.out.println(protectedVar); 
	        System.out.println(publicVar);   
	 }
}
