package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.AreaCalculator;

public class AreaCalculatorTest {
	AreaCalculator areaCalculator;
	@BeforeEach
	void init() {
		areaCalculator  = new AreaCalculator();
	}
	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, areaCalculator.calculateAreaOfCircle(5));
	}
	@Test
	void testCalculateAreaOfRectangle() {
		assertEquals(190, areaCalculator.calculateAreaOfRectangle(10, 19));
	}
	@Test
	void testCalculateAreaOfTriangle() {
		assertEquals(100, areaCalculator.calculateAreaOfTriangle(20, 10));
	}
	
//	assertTrue - This method can directly check the value of a method. Compars directly to true
//	assertFalse - Does the same work but will check for false one
//  assertThrows checks whether the code is throwing correct exception or not, it expects an executable
}
