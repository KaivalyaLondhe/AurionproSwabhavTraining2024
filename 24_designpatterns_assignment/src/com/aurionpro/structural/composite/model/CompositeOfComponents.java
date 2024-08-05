package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CompositeOfComponents implements ComponentsOfComputer {
	private String name;
	List<ComponentsOfComputer> components = new ArrayList<>();

	public CompositeOfComponents(String name) {
		super();
		this.name = name;
	}

	public void addComponent(ComponentsOfComputer component) {
		components.add(component);
	}

	public void removeComponent(ComponentsOfComputer component) {
		components.remove(component);
	}

	public void getTotalPrice() {

	}
	@Override
	public int getPrice() {
		int totalPrice = 0;
				// TODO Auto-generated method stub
//		Stream price = components.stream().map((component) -> component.getPrice());
//		int totalPrice =  (int) price.reduce(0,
//				(component1, component2) ->  component1+component2);
				for(ComponentsOfComputer component: components) {
					totalPrice += component.getPrice();
				}
		return totalPrice;
	}

	@Override
	public void display() {
		for (ComponentsOfComputer component : components) {
			component.display();
		}
	}

}
