package com.aurionpro.test;

public class StringTest {
	public static void main(String[] args) {
	
//		String name1 = "Kaivalya";
//		String name2 = "Kaivalya";
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//	
//		System.out.println(name1==name2);
//		
//		String name3 = new String("SK");
//		String name4 = new String("SK");
//		System.out.println(name3.hashCode());
//		System.out.println(name4.hashCode());
//		
//		System.out.println(name3==name4);
//		
//		String name5 = "Kaivalya Londhe";
//		System.out.println(name5.hashCode());
//		name5 = name5 + " SK";
//		System.out.println(name5.hashCode());
//		
		//Strings are immutable 
		
		StringBuffer name6 = new StringBuffer("SK");
		System.out.println(name6.hashCode());
		name6 = name6.append("Valo");
		System.out.println(name6.hashCode());
		
		//When we use stringbuffer instead of strings, string buffers are  mutable.
		
		StringBuilder name7 = new StringBuilder("DMCE");
		System.out.println(name7.hashCode());
		name7 = name7.append("College");
		System.out.println(name7.hashCode());
		
		//StringBuilders are also mutable
		
		String str = "Geeks";
		System.out.println(str.hashCode());

        // Converting String object to StringBuffer object
        // by
        // creating object of StringBuffer class
        StringBuffer sbr = new StringBuffer(str);
        System.out.println(str.hashCode());
}
}
