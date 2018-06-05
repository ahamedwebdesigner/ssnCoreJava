package com.ssn.Fo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class _8_File_Read_File_scanner{

    public static void main(String[] args) throws IOException {
    	
    	String fileName = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\HellowJava.txt";
    	Path path = Paths.get(fileName);
    	Scanner scanner = new Scanner(path);
    	System.out.println("Read text file using Scanner");
    	//read line by line
    	while(scanner.hasNextLine()){
    	    //process each line
    	    String line = scanner.nextLine();
    	    System.out.println(line);
    	}
    	scanner.close();
    	
    }

  
   
    

    
    
}
