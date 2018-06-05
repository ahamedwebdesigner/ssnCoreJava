package com.ssn.Fo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _6_File_Read_File_UsingFiles2{

    public static void main(String[] args) throws IOException {
    	
    	String fileName = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\HellowJava.txt";
    	File file = new File(fileName);
    	FileReader fr = new FileReader(file);
    	BufferedReader br = new BufferedReader(fr);
    	String line;
    	while((line = br.readLine()) != null){
    	    //process the line
    	    System.out.println(line);
    	}
    	
    	
    }

  
   
    

    
    
}
