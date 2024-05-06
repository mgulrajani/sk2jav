package com.training.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("d:\\sun.png");
			FileOutputStream fos = new FileOutputStream("d:\\suncopy.png");){
			int byteRead;
			while((byteRead =fis.read())!=-1) {
				fos.write(byteRead);
			}
		System.out.println("Sun copied!!");		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
