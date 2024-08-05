package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Guitar> listOfGuitars = new ArrayList<Guitar>();
	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		listOfGuitars.add(guitar);
	}
	public Guitar getGuitar(String serialNumber) {
		for(Guitar guitar : listOfGuitars) {
			if(serialNumber == guitar.getSerialNumber())
				return guitar;	
		}
		return null;
	}
	public Guitar search(Guitar searchGuitar) {
		for(Guitar guitar : listOfGuitars) {
			String builder = searchGuitar.getBuilder();
			if((builder!=null) && (!builder.equals(""))) &&  (!builder.equals(guitar.getBuilder()))
		}
	}
	
}
