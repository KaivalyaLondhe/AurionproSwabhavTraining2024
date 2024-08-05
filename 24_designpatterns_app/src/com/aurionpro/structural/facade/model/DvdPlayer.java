package com.aurionpro.structural.facade.model;

public class DvdPlayer implements IOn{
	private String movie;
	
	public DvdPlayer(String movie) {
		super();
		this.movie = movie;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("DVD Player is now on.");
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}

}
