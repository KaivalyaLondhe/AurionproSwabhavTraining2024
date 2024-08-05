package com.aurionpro.model;

public class Triangle extends Shape{
	private int base;
	private int height;
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("Area: " + (0.5*base*height));
	}
}
