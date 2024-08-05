package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.ICar;
import com.aurionpro.creational.abstractfactory.model.ICarFactory;
import com.aurionpro.creational.abstractfactory.model.MarutiFactory;

public class CarTest {
	public static void main(String[] args) {
		ICarFactory factory  = new MarutiFactory();
		ICar maruti = factory.makeCar();
		maruti.start();
		maruti.stop();
	}
}