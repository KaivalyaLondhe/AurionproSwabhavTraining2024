package com.aurionpro.ocp.violation.model;

public class Rectangle implements Shape{
	
	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	

	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	
}
