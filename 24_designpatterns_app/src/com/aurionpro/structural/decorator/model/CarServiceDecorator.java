package com.aurionpro.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService{
	static ICarService carObj;

	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
