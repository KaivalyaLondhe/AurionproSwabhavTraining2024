package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName()+ "\nThis is a golden hat";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "750";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Description goes here";
	}

}
