package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintingLinesOfFileUsingFileReader{
	
	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("D:\\Aurionpro_Training\\21_streams_assignment\\src\\com\\aurionpro\\test\\names"))){
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}