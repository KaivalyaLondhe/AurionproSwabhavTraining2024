package com.aurionpro.model;

public class Car extends FourWheeler{
	private int price;
	public Car(String companyName, int mileage, int price) {
		super(companyName, mileage);
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [price=" + price +   ", Mileage=" + getMileage()
				+ ", CompanyName=" + getCompanyName() + "]";
	}

	
	
}
