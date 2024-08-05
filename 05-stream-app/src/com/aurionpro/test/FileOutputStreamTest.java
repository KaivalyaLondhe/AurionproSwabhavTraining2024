package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_Training\\05-stream-app\\src\\com\\aurionpro\\test\\test1.txt");
			int ch;
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro_Training\\05-stream-app\\src\\com\\aurionpro\\test\\test3.txt");
			while((ch=fileInputStream.read())!=-1) {
				fileOutputStream.write(ch);
			}
			System.out.println("File copied successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
