package com.aurionpro.structural.facade.model;

public class HotelReception {
	
	public void getIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		IMenu menu = new IndianMenu();
		menu.displayMenu();
	}
	public void getItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		IMenu menu = new ItalianMenu();
		menu.displayMenu();
	}
}
