package com.aurionpro.creational.abstractfactory.model;

public class MahindraCarFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new MahindraCar();
	}

}
