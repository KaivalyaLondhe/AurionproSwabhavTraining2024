package com.aurionpro.model;

public class Rectangle {

	private int height;
	private int width;
	
	public Rectangle() {
		this.height = 20;
		this.width = 10;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}

	public int area(int height, int width) {
		int area = this.height*this.width;
		System.out.println("The area of rectangle is: " + area);
		return area;
	}
}
