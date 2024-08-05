package com.aurionpro.test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class JavaFileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Aurionpro_Training\\06_files_app\\src\\com\\aurionpro\\test");

		System.out.print(file.canRead()); // Used to check whether the file is readable or not
		System.out.println(file.canWrite()); // Used to check whether the file is writable or not

		file.createNewFile(); // Used to create a new file
		System.out.println("Test file created successfully");
		file.delete(); // Used to delete file
		String newString = file.getName();
		System.out.println(newString);
		Path parentName = file.toPath();
		System.out.println(parentName);
		URI URIName = file.toURI();
		System.out.println(URIName);
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++)
			System.out.println(files);

	}

}
