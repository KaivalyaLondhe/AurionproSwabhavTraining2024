package com.aurionpro.structural.adapter.model;

public class Chocolate implements IItems{
	
	private String name;
	private double mrp;
	
	

	public Chocolate(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public void setMrp(double mrp) {
		this.mrp = mrp;
	}


	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Double getItemPrice() {
		// TODO Auto-generated method stub
		return mrp;
	}

}
