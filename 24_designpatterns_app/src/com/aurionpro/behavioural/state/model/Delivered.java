package com.aurionpro.behavioural.state.model;

public class Delivered implements IPacketState {
	private Packet packet;
	

	public Delivered(Packet packet) {
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
		packet.setState(new Delivered(packet));
		System.out.println("Packet is at Delivered state");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Shipped(packet));
		System.out.println("Packet moved to Shipped State");
	}

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is already at last state");
	}

}
