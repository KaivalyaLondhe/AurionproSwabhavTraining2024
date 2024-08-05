package com.aurionpro.behavioural.state.model;

public class Shipped implements IPacketState {
	private Packet packet;

	public Shipped(Packet packet) {
		super();
		this.packet = packet;
	}
	

	public Packet getPacket() {
		return packet;
	}


	public void setPacket(Packet packet) {
		this.packet = packet;
	}


	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Shipped(packet));
		System.out.println("Packet is at  shipped state");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Ordered(packet));
		System.out.println("Packet moved to previous state ordered state");
	}

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Delivered(packet));
		System.out.println("Packet moved to next state delivered state");
	}

}