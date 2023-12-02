package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java11FileHandling {

	public static void main(String[] args) throws Exception{
	// Write Data in file 
//		Path myFilePath		=  Paths.get("abc.txt");
//		String msg = "Welcome to java 11 features";
//		Files.writeString(myFilePath, msg);
//		System.out.println("File created...");
		// Read the files 
		//Path myFilePath		=  Paths.get("abc.txt");
		Path myFilePath		=  Paths.get("C:\\Users\\akash\\Desktop\\JavaProgram\\Demo.java");
		String data = Files.readString(myFilePath);
		System.out.println(data);
	}

}
