package com.training.day6;

import java.io.File;

public class UsingIOToListDir {
	
	public static void main(String[] args) {
		
		 File f1 = new File("d:\\mkg");
		 
		 File[]files =  f1.listFiles();
		 
		 if (files != null){
			 
			 for(File file:files) {
				 
				if(file.isDirectory()) {
					System.out.println("Directory :"+file.getName());
				}
				else {
					System.out.println("File :"+file.getName());
				}
			 }
		 }
		 
		
	}

}
