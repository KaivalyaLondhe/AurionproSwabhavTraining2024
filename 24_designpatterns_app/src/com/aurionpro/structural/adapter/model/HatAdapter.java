package com.aurionpro.structural.adapter.model;

public class HatAdapter implements IItems{
	Hat hat = new Hat("Nike ", "Hat", 200, 12);
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getShortName().concat(hat.getLongName());
	}

	@Override
	public Double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBasePrice()+(hat.getBasePrice()*hat.getTax()/100);
	}

}