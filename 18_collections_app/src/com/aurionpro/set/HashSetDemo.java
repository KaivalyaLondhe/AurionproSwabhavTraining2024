package com.aurionpro.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Kaivalya");
		set.add("Sarvesh");
		set.add("Nishank");
		set.add("Chirag");
		set.add("Chirag");
		//as one chirag is already present second duplicate entry will be ignored
		
		System.out.println(set);
		//hashsets are stored in random order as they only have hash code to point at
		
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Aagya");
		set2.add("Sakshi");
		set2.add("Devansh");
		set2.add("Shirish");
		System.out.println(set2);
		
		//linked hash set creates an internal linked list to store elements in the order entered
		
		TreeSet<String> set3 = new TreeSet<String>();
		set3.add("Kaivalya");
		set3.add("Sarvesh");
		set3.add("Nishank");
		set3.add("Chirag");
		set3.add("Chirag");
		
		System.out.println(set3);
		//Treeset implements sorted set hence the set will be sorted. By default the sorting will be ascending
	}
}
