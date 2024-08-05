package com.aurionpro.model;

public class FourWheeler extends Vehicle{
	private int mileage;
	public FourWheeler(String companyName, int mileage) {
		super(companyName);
		// TODO Auto-generated constructor stub
		this.mileage = mileage;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	

	
	
}
