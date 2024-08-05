package com.aurionpro.creational.factory.model;

public class CarFactory {
	public static ICar makeCar(CarCompany string) {
		ICar car = null;
		if(string.equals(CarCompany.MARUTI))
			car = new Maruti();
		if(string.equals(CarCompany.TATA))
			car = new Tata();
		if(string.equals(CarCompany.MAHINDRA))
			car = new Mahindra();
		return car;
		
	}
}
