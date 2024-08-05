package com.aurionpro.model;

public abstract class HatDecorator implements IHat{
	static IHat hat;
	
	public HatDecorator(IHat hat) {
		super();
		this.hat=hat;
		// TODO Auto-generated constructor stub
	}



}
