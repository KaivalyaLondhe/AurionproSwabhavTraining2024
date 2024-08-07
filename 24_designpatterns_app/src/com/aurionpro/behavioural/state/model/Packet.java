package com.aurionpro.behavioural.state.model;

public class Packet implements States{
	private IPacketState state;
	
	

	public Packet(IPacketState state) {
		super();
		this.state = state;
	}

	public IPacketState getState() {
		return state;
	}

	public void setState(IPacketState state) {
		this.state = state;
	}
	public void goToNextState() {
		state.next(this);
		System.out.println("Packet moved to next " + state + " state");
		
		
	}
	public void goToPreviousState() {
		state.previous(this);
		System.out.println("Packet moved to previous " + state + " state");
		
	}
	public void currentStatus() {
		System.out.println("Your package is currently in " + state + " state.");
	}
}
