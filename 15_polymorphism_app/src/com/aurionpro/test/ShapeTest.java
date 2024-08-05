package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
	
		Circle circle = new Circle(10);
		circle.area();
		
		Rectangle rectangle = new Rectangle(10,20);
		rectangle.area();
		
		Triangle triangle = new Triangle(20,30);
		triangle.area();
		
		Shape shape;
		
		shape = new Circle(40);
		shape.area();
		
		shape = new Rectangle(10, 20);
		shape.area();
		
		shape = new Triangle(20,30);
		shape.area();
	}
	
}