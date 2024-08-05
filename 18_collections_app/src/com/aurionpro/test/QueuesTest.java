package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesTest {

	public static void main(String[] args) {
		
		Queue<Integer> numbers = new PriorityQueue<Integer>();
		Queue<Integer> numbers2 = new LinkedList<Integer>();
		Queue<Integer> numbers3 = new ArrayDeque<Integer>();
		
		numbers2.add(2);
		numbers2.offer(1);
		
		numbers.offer(1); //adding the element
		System.out.println(numbers);
		numbers.add(2); //adding the element	
		System.out.println(numbers);
		
		System.out.println(numbers.contains(2));
		System.out.println(numbers.containsAll(numbers2));
//		numbers.peek(); //returning the element without removing
		System.out.println(numbers.peek());
		System.out.println(numbers);
//		numbers.poll(); //returning the element and removing
		System.out.println(numbers.poll());
		System.out.println(numbers);
//		numbers.remove();
		System.out.println(numbers.remove());
		

	}

}
