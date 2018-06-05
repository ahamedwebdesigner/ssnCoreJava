package com.ssn.Fo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _5_File_Read_File_UsingFiles{

    public static void main(String[] args) throws IOException {


    
    	String fileName = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\HellowJava.txt";
    	
   
    	Path path = Paths.get(fileName);
    	//byte[] bytes = Files.readAllBytes(path);
    	List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
    	
    	System.out.println(allLines);
    	
    	
       
    }

  
   
    

    
    
}
