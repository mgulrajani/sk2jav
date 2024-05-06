package com.training.day6;

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirPathDemo {
	
	public static void main(String[] args) {
		
		Path p1 = Paths.get("d:\\mkg");
		
		Path p2 = Paths.get("d:\\sun.png");
		
		try {
			
		   Stream<Path> files =  Files.walk(p1,2);
		  files.forEach(path->System.out.println(path));
		  
		  Files.delete(p2);
		  System.out.println("sun.png successfully deleted");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
