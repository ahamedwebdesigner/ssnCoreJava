package com.ssn.Fo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class _3a_File_Write_File_UsingFiles2{

    public static void main(String[] args) throws IOException {
    	
        String filename = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\Files_write_append.txt";
        String data = "I will write this String to File in Java";       	// data to write in file
        
        // Files class from Java 1.7 to write files, internally uses OutputStream
        //Files.write(Paths.get( "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\Files_write_append.txt"), data.getBytes());
        
        
        Path filePath = Paths.get(filename);
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        
        
        String dataWithNewLine=data+System.getProperty("line.separator");
        
        
        Files.write(Paths.get(filename), dataWithNewLine.getBytes(),StandardOpenOption.APPEND);
        
       
    }

  

    

    
    
}
