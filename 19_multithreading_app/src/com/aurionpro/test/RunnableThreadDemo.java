package com.aurionpro.test;

import com.aurionpro.threads.RunnableThread;

public class RunnableThreadDemo {
	public static void main(String[] args) {
		RunnableThread thread = new RunnableThread("Thread 1");
		System.out.println(thread.getThread().isAlive());
		
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		try {
			thread.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getThread().isAlive());
	}
}
