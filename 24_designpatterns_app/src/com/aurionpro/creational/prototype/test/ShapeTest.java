package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.Rectangle;
import com.aurionpro.creational.prototype.model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(10,20);
		Shape clonedRectangle = rectangle.clone();
		
		rectangle.draw();
		clonedRectangle.draw();
	}
}
