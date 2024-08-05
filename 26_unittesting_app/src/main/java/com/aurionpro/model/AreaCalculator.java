package com.aurionpro.model;

public class AreaCalculator {
	public double calculateAreaOfCircle(int radius) {
		return 3.14*radius*radius;
	}
	public double calculateAreaOfRectangle(int length, int breadth) {
		return length*breadth;
	}
	public double calculateAreaOfTriangle(int base, int height) {
		return 0.5*base*height;
	}
}
