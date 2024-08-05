package com.aurionpro.model;



public class Account{
	private String name = null;
	static private int count =0;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Account.count = count;
	};
	
}