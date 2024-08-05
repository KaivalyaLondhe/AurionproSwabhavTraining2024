package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("Kaivalya");
		list.add("Londhe");
		System.out.println(list);
		
		list.add(1, "Sarvesh");
		list.add(2, 24);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		List<String> names = new ArrayList<String>();
		
		names.add("Kaivalya");
		names.add("Londhe");
		names.add("Manjiri");
		
		System.out.println("Printing using normal for loop");
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i));
		
		System.out.println("Using advanced for loop");
		for(String name:names)
			System.out.println(name);
		
		System.out.println("Using iterator");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("Using list iterator forward");
		ListIterator<String> iterator2 = names.listIterator();
		while(iterator2.hasNext())
			System.out.println(iterator2.next());
		
		while(iterator2.hasPrevious())
			System.out.println(iterator2.previous());
	}
}
