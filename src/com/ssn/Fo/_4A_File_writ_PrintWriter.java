package com.ssn.Fo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _4A_File_writ_PrintWriter{

    public static void main(String[] args) {
    	


    	String fileName =  "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\PrintWriter.txt"; // file name
        String data = "I will write this String to File in Java";       	// data to write in file
         try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)))) {
            out.println(data);
        }catch (IOException e) {
            System.err.println(e);
        }
        
        
      
    }

  
   
    

    
    
}
