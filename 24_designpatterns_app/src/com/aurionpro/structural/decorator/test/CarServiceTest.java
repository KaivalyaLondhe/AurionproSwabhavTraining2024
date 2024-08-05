package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
		System.out.println(car.getCost());
		
		
	}
}
