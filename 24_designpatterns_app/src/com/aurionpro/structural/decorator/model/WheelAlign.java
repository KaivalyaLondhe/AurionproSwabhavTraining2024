package com.aurionpro.structural.decorator.model;

public class WheelAlign extends CarServiceDecorator{
	public WheelAlign(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	ICarService obj;
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 500+obj.getCost();
	}

}
