package com.aurionpro.model;

public class BoxWeight extends Box {

	private int weight;
	public BoxWeight(int width, int depth, int height, int weight) {
		super(width, depth, height);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", Width=" + getWidth() + ", Depth=" + getDepth()
				+ ", Height=" + getHeight() + "]";
	}
	

}
