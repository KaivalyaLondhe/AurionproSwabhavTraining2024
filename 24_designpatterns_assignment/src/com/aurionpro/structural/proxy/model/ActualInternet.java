package com.aurionpro.structural.proxy.model;

public class ActualInternet implements Internet {

	 @Override
	    public void connectTo(String host) {
	        System.out.println("Successfully opened connection to " + host);
	    }

}
