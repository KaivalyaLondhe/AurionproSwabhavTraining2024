package com.aurionpro.behavioural.command.test;

import com.aurionpro.behavioural.command.model.Command;
import com.aurionpro.behavioural.command.model.Fan;
import com.aurionpro.behavioural.command.model.FanOffCommand;
import com.aurionpro.behavioural.command.model.FanOnCommand;

public class RemoteTest {
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.turnOn();
		fan.turnOn();
		
		Command fanOn = new	FanOnCommand(fan);
		Command fanOff = new FanOffCommand(fan);
		fanOn.execute();
	}
	
}
