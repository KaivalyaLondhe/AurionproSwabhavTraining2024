package com.aurionpro.structural.facade.model;

public class MovieFacade {
	public void watchMovie() {
		IOn dvdPlayer = new DvdPlayer("Movie 1");
		IOn soundSystem = new SoundSystem(10);
		IOn projector = new Projector();
		
		dvdPlayer.on();
		soundSystem.on();
		projector.on();
	}

}
