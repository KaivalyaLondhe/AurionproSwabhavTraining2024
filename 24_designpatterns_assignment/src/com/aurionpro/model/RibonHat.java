package com.aurionpro.model;

public class RibonHat extends HatDecorator{

	public RibonHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName() + "This hat will include ribons";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "Ribbon addtion will cost you Rs. 20 Extra over the existing cost of " + hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription() + " Adding ribbins to your hat will make it even cuter";
	}
	

}
