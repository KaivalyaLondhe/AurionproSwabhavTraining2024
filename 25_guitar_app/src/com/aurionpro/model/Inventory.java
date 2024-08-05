package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Inventory {


	 private List guitars;
	 
	 public Inventory() {
	  guitars = new LinkedList();
	  
	 }
	 
	 public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, int numStrings,  Wood backWood, Wood topWood) {
	   GuitarSpec spec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
	      Guitar guitar = new Guitar(serialNumber, price, spec);
	  guitars.add(guitar);
	 }
	 
	 public Guitar getGuitar(String serialNumber) {
	  for(Iterator i = guitars.iterator(); i.hasNext();) {
	   Guitar guitar = (Guitar) i.next();
	   if(guitar.getSerialNumber().equals(serialNumber)) {
	    return guitar;
	   }
	  }
	  return null;
	 }
	 
	 public List search(GuitarSpec searchSpec) {
	  List matchingGuitar = new LinkedList();
	  for(Iterator i = guitars.iterator(); i.hasNext();) {
	   Guitar guitar = (Guitar) i.next();
	   if(guitar.getSpec().matches(searchSpec)) {
	    matchingGuitar.add(guitar); 
	   }
	  }
	  return matchingGuitar;
	 }
	}




	wood enum
	package com.aurionpro.model;

	public enum Wood {
	 INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, ALDER;
	 
	 public String toString() {
	  switch (this) {
	  case INDIAN_ROSEWOOD:
	   return "Indain Rosewood";
	  case BRAZILIAN_ROSEWOOD:
	   return "Brazilian Rosewood";
	  case MAHOGANY:
	   return "Mahogany";
	  case ALDER:
	   return "Alder";
	  default:
	   return "Default";
	  }
	 }
}