package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.ComponentPartsOfComputer;
import com.aurionpro.structural.composite.model.CompositeOfComponents;

public class ComputerTest {
	public static void main(String[] args) {
		ComponentPartsOfComputer hardDrive = new ComponentPartsOfComputer("Seagate Baraccuda Green", 4500);
		ComponentPartsOfComputer ram = new ComponentPartsOfComputer("G.Skill Ripjaws", 2200);
		ComponentPartsOfComputer gpu = new ComponentPartsOfComputer("NVDIA RTX 4090", 215000);
		ComponentPartsOfComputer cpu = new ComponentPartsOfComputer("Intel Core 9 Ultra", 75000);
		ComponentPartsOfComputer mouse = new ComponentPartsOfComputer("Razer Viper 8K", 3000);
		ComponentPartsOfComputer keyboard = new ComponentPartsOfComputer("Redragon Karuma K552", 2750);
		ComponentPartsOfComputer monitor = new ComponentPartsOfComputer("MSI Gaming Monitor", 14000);
		
		CompositeOfComponents computer = new CompositeOfComponents("Computer");
		CompositeOfComponents peripherals = new CompositeOfComponents("Peripherals");
		
		computer.addComponent(ram);
		computer.addComponent(gpu);
		computer.addComponent(cpu);
		computer.addComponent(hardDrive);
		
		peripherals.addComponent(mouse);
		peripherals.addComponent(keyboard);
		peripherals.addComponent(monitor);
		
		computer.display();
		System.out.println("\n");
		peripherals.display();
		
		
		
		System.out.println(computer.getPrice());
		
		
	}
}