package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class stringClass = Class.forName("java.lang.String");
		
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getTypeName());
		
		System.out.println("For methods:");
		
		Method[] stringMethods = stringClass.getMethods();
		for(Method method: stringMethods) {
			System.out.println(method.getName() + "\t" + method.toGenericString());
		}
		System.out.println("For constructors");
		Constructor[] stringConstructors = stringClass.getConstructors();
		for(Constructor constructor: stringConstructors) {
			System.out.println(constructor.getName() + "\t" + constructor.getParameterCount());
			Parameter parameters[] = constructor.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println(parameter.getName());
			}
		}

	}

}
