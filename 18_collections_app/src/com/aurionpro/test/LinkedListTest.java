package com.aurionpro.test;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Kaivalya");
		names.add("Nishank");
		
		names.addFirst("Aagya");
		names.addLast("Sarvesh");
		names.add("Chirag");
		
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("The last element is: "+names.getLast());
	}
}
