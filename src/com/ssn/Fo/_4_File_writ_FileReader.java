package com.ssn.Fo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _4_File_writ_FileReader{

    public static void main(String[] args) throws IOException {
    	

    	// Use Streams when you are dealing with raw data
    	String fileName =  "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\OutputStream.txt";
        String data = "I will write this String to File in Java";       	// data to write in file
       
      
        FileOutputStream os = new FileOutputStream(new File(fileName));
        os.write(data.getBytes(), 0, data.length());
        os.close();
    }

  
   
    

    
    
}
