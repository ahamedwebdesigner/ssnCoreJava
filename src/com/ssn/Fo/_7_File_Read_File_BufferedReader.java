package com.ssn.Fo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7_File_Read_File_BufferedReader{

    public static void main(String[] args) throws IOException {
    	
    	String fileName = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\HellowJava.txt";
    	File file = new File(fileName);
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
