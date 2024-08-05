package com.aurionpro.structural.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structural.adapter.model.Biscuit;
import com.aurionpro.structural.adapter.model.Chocolate;
import com.aurionpro.structural.adapter.model.HatAdapter;
import com.aurionpro.structural.adapter.model.IItems;
import com.aurionpro.structural.adapter.model.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
	
		IItems biscuit = new Biscuit("Good Day", 200);
		IItems Chocolate = new Chocolate("KitKat ch" , 10);
		IItems HatAdapter = new HatAdapter();
		ShoppingCart cart = new ShoppingCart(biscuit, Chocolate, HatAdapter);
		List<IItems> listOfItems = new ArrayList<IItems>();
		cart.addItemsToCart(listOfItems);
		cart.displayItems(listOfItems);
		cart.getCartPrice(listOfItems);
	}
}