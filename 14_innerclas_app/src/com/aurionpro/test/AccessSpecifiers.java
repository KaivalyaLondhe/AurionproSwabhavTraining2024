package com.aurionpro.test;

public class AccessSpecifiers {

	    private int privateVar = 10;
	    int defaultVar = 20;
	    protected int protectedVar = 30;
	    public int publicVar = 40;

	    public void accessVariables() {
	        System.out.println(privateVar);   
	        System.out.println(defaultVar);   
	        System.out.println(protectedVar); 
	        System.out.println(publicVar);   
	    }
	    public static void main(String[] args) {
			AccessSpecifiers access = new AccessSpecifiers();
			access.accessVariables();
		}

}
