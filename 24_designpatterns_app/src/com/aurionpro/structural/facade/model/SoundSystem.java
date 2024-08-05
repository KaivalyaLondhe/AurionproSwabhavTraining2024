package com.aurionpro.structural.facade.model;

public class SoundSystem implements IOn{
	private double volumeLevel;
	
	public SoundSystem(double volumeLevel) {
		super();
		this.volumeLevel = volumeLevel;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Sound System is on.");
	}
	public void setVolumeLevel(double volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	

}
