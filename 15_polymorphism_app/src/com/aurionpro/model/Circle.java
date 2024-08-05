package com.aurionpro.model;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area: " + (3.14*radius*radius));
	}
}
