package com.aurionpro.behavioural.command.model;

public class FanOnCommand implements Command{
	Fan fan;
	
	public FanOnCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.turnOff();
	}

}
