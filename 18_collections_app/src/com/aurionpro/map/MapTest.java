package com.aurionpro.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Kaivalya");
		map.put(3, "Nishank");
		map.put(8, "Sarvesh");
		
		System.out.println(map);
		
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(10, "Manjiri");
		map2.put(4, "Chirag");
		map2.put(15, "Devansh");
		
		System.out.println(map2);
		
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
		map3.put(45, "Ashish");
		map3.put(70, "Prasad");
		map3.put(23, "Tanvi");
		
		System.out.println(map3);
		
		
		Set<Entry<Integer,String>> entries = map3.entrySet();
		
		for(Entry<Integer, String> entry: entries)
		{
			System.out.println(entry.getKey()+"-" + entry.getValue());
		}	// this is how you retrive values from a map with the help of using sets
	}
}
