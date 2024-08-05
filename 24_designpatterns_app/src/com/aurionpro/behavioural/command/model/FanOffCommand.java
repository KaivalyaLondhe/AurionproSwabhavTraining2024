package com.aurionpro.behavioural.command.model;

public class FanOffCommand implements Command{
	Fan fan;
	
	public FanOffCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOff();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.turnOn();
	}

}
