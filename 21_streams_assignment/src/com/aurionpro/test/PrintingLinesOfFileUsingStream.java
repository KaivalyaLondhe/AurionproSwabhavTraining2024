package com.aurionpro.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintingLinesOfFileUsingStream {
	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("D:\\Aurionpro_Training\\21_streams_assignment\\src\\com\\aurionpro\\test\\names"))
			.forEach((name)->System.out.println(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
