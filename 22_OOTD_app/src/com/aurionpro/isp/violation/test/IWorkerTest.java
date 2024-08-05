package com.aurionpro.isp.violation.test;

import com.aurionpro.isp.violation.model.Labour;
import com.aurionpro.isp.violation.model.Robot;

public class IWorkerTest {
	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.drink();
		
		Robot robot = new Robot();
		robot.drink();
	}
}
