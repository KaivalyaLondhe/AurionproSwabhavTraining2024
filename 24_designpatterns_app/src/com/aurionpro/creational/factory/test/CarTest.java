package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarCompany;
import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.ICar;

public class CarTest {
	public static void main(String[] args) {
		ICar car;
		car = CarFactory.makeCar(CarCompany.MARUTI);
		car.start();
		car.stop();
		
	}
}
