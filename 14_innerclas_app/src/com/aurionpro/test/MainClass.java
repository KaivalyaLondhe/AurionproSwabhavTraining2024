package com.aurionpro.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		outer.print();
		
		OuterClass.innerClass inner = outer.new innerClass();
		inner.print();
		
		OuterClass.innerClass2 inner2 = new OuterClass.innerClass2();
		inner2.print();
	}

}
//In Java, an inner class is a class that is defined inside another class. An inner class can access the members of the outer class, including private members, and it can be used to implement callbacks and event handlers. There are four types of inner classes in Java:
//
//Member Inner Class: It is a non-static class that is defined at the member level of a class. It has access to all the members of the outer class, including private members.
//
//Local Inner Class: It is a class that is defined inside a method or a block of code. It has access to the final variables of the method or block in which it is defined.
//
//Anonymous Inner Class: It is a class that is defined inline and has no name. It is used to implement interfaces or extend classes without creating a separate class.
//
//Static Nested Class: It is a static class that is defined inside another class. It does not have access to the non-static members of the outer class.
//
//Inner classes have several advantages:
//
//Encapsulation: Inner classes can be used to encapsulate implementation details of a class, making the code more modular and maintainable.
//
//Access Control: Inner classes can access private members of the outer class, allowing for more precise control over the visibility of members.
//

//Code Organization: Inner classes can be used to organize code by grouping related classes together.

//
//Private: Accessible only within the same class.
//Default (No specifier): Accessible within the same package.
//Protected: Accessible within the same package and by subclasses even if they are in a different package.
//Public: Accessible from any other class.

//A superclass reference can directly refer to subclass object.
// runtime polymorphism is also dynamic method dispatch



