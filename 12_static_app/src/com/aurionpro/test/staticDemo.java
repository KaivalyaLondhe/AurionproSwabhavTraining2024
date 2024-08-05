package com.aurionpro.test;

class Demo {
	private int a = 1;
	static 	private int b = 1;
	private int c = 1;

	public void increment() {
		a++;
		b++;
		c++;
	}

	public void display() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	static {
		System.out.println("THIS WILL BE EXECUTED ONCE AS IT IS STATIC");
	}
	{
		System.out.println("This will be executed as many times as that of object as this is non static");
	}
}

public class staticDemo {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.print("before changes D1 = ");
		d1.display();
		d1.increment();
		System.out.print("after changes D1 = ");
		d1.display();
		Demo d2 = new Demo();
		System.out.print("before changes D2 = ");
		d2.display();
		d2.increment();
		System.out.print("after changes D2 = ");
		d2.display();
		Demo d3 = new Demo();
		System.out.print("before changes D3 = ");
		d3.display();
		d3.increment();
		System.out.print("after changes D3 = ");
		d3.display();

		// static {
		// You cannot call static within a method. Static can only be called inside a
		// class.
		// }
	}

	static {
		System.out.println("Hello this is magic");
	}
}
