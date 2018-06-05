package com.ssn.Fo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_readFile_2 {

	public static void main(String[] args) throws IOException {
		// Reading file 
		
		
		File file = new File("dataxxx.txt");

		
		
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String line;
		while((line = br.readLine()) != null){
		    //process the line
		    System.out.println(line);
		}
		br.close();
		
	}

}
