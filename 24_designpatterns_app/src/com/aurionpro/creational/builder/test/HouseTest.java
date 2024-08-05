package com.aurionpro.creational.builder.test;

import com.aurionpro.creational.builder.model.House;

public class HouseTest {
	public static void main(String[] args) {
		House house = new House.Builder()
								.buildFoundation("Concrete foundation")
								.buildStructure("Wood and brick structure")
								.buildRoof("Metal roof")

								.build();

		System.out.println("House built with:");
		System.out.println("Foundation: " + house.getFoundation());
		System.out.println("Structure: " + house.getStructure());
		System.out.println("Roof: " + house.getRoof());
		System.out.println("Furnished: " + house.isFurnished());
		System.out.println("Painted: " + house.isPainted());
	}

}
