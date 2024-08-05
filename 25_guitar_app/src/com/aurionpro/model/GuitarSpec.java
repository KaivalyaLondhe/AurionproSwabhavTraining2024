package com.aurionpro.model;

public class GuitarSpec {
	private int numStrings;
	 private Builder builder;
	 private String model;
	 private Type type;
	 private Wood backWood;
	 private Wood topWood;
	 public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backWood, Wood topWood) {
	  super();
	  this.builder = builder;
	  this.model = model;
	  this.type = type;
	  this.numStrings = numString;
	  this.backWood = backWood;
	  this.topWood = topWood;
	 }
	 public Builder getBuilder() {
	  return builder;
	 }
	 public void setBuilder(Builder builder) {
	  this.builder = builder;
	 }
	 public String getModel() {
	  return model;
	 }
	 public void setModel(String model) {
	  this.model = model;
	 }
	 public Type getType() {
	  return type;
	 }
	 public void setType(Type type) {
	  this.type = type;
	 }
	 public Wood getBackWood() {
	  return backWood;
	 }
	 public void setBackWood(Wood backWood) {
	  this.backWood = backWood;
	 }
	 public Wood getTopWood() {
	  return topWood;
	 }
	 public void setTopWood(Wood topWood) {
	  this.topWood = topWood;
	 }
	 
	 public int getNumStrings() {
	  return numStrings;
	 }
	 public boolean matches(GuitarSpec otherSpec) {
	        if (builder != otherSpec.getBuilder()) {
	            return false;
	        }
	        String model = otherSpec.getModel().toLowerCase();
	        if ((model != null) && (!model.trim().isEmpty()) && (!model.equals(this.model.toLowerCase()))) {
	            return false;
	        }
	        if (type != otherSpec.getType()) {
	            return false;
	        }
	        if (backWood != otherSpec.getBackWood()) {
	            return false;
	        }
	        if (topWood != otherSpec.getTopWood()) {
	            return false;
	        }
	        return true;
	    }
	 
	 
	}
	inventory
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
