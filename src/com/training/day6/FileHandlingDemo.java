package com.training.day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingDemo {
	
	//there is a file on d:\\data.txt  , I want to read the data from that file
	//open the file in the input mode , using FileReader
	//and I want to create a  copy of that file , copydata.txt  ,which I will open in Output mode
	//since it is characters /text  ,I will FileReader for input and FileWriter for output
	public static void main(String[] args) {
		//try without resources syntax
		try {
			
			FileReader fr = new FileReader("d:\\data.txt");
			BufferedReader bfr =  new BufferedReader(fr);
			FileWriter fw  =new FileWriter("d:\\copydata.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Here is the data from data.txt");
			while(true) {
				
				String line =  bfr.readLine();
				if(line==null) {
					
					break;
				}
			  bw.write(line+"\n");
			  bw.flush();

			System.out.println("copied the file");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("outside the blocks , in finally");
		}
		
		
		
	}
}
