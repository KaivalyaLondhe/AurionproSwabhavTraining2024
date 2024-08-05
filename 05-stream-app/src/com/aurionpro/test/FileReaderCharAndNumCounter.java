package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderCharAndNumCounter {
	public static void main(String[] args) throws FileNotFoundException {
		int ch;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"D:\\Aurionpro_Training\\05-stream-app\\src\\com\\aurionpro\\test\\test2");
			int count = 0;
			while ((ch = fileInputStream.read()) != -1) {
				charCount++;
				if (((char) ch == ' ' || (char) ch == '\n' || (char) ch == '\t') && (char) ch != ' ' + ' ') {
					wordCount++;
				}
				if ((char) ch == '\n') {
					lineCount++;
				}

			}
			if (charCount != 0)
				lineCount++;
			System.out.print(charCount + " " + wordCount + " " + lineCount);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
