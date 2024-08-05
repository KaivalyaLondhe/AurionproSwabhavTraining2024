package com.aurionpro.structural.composite.model;

public class ComponentPartsOfComputer implements ComponentsOfComputer{
	private String name;
	private int price;
	
	
	public ComponentPartsOfComputer(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public void display() {
		System.out.println(name + " : " + price );
	}

}
