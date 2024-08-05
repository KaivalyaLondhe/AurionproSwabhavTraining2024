package com.aurionpro.behavioural.state.model;

public class Ordered implements IPacketState{
	private Packet packet;
	
	public Ordered(Packet packet) {
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
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Shipped(packet));
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Ordered(packet));
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("You have already placed an order");
	}
	

}