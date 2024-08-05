package com.aurionpro.iso.sollution.test;

import com.aurionpro.iso.solution.model.Labour;
import com.aurionpro.isp.violation.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.drink();
		Robot robot = new Robot();
		robot.startWork();
	}
}
