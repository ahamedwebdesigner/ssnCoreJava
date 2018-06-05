package com.ssn.Fo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _3_File_Write_File_UsingFiles{

    public static void main(String[] args) throws IOException {
    	

        String data = "I will write this String to File in Java";       	// data to write in file
        
        // Files class from Java 1.7 to write files, internally uses OutputStream
        Files.write(Paths.get( "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\UsingFiles.txt"), data.getBytes());
        
       
    }

  

    

    
    
}
