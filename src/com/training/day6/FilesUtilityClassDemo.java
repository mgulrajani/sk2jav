package com.training.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesUtilityClassDemo {
	
	public static void main(String[] args) {
	 Path p1 = Paths.get("d:\\data.txt");
	 
	 Path p2 = Paths.get("d:\\data3.txt");
	 
	 try {
		 
         if(Files.exists(p1))	{	 
		 Files.copy(p1, p2);
		 System.out.println("Files copied using Files.copy method of nio");
	 }}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
