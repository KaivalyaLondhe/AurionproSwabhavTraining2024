package com.aurionpro.model;

public class Box {
	
	public int width;
	public int height;
	public int depth;
	
	public Box() {
		this.width =10;
		this.height =20;
		this.depth = 10;
	}
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
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
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getDepth() {
		return this.depth;
	}
	// default is public within same package only
}
