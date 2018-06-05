package com.ssn.Fo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _1_File_Write_File_FileWriter{

    public static void main(String[] args){
    	

        String data = "I will write this String to File in Java";       	// data to write in file
       
        // 1) open file object
        File file = new File("C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\FileWriter.txt");
        FileWriter fr;
		try {
			fr = new FileWriter(file);
			fr.write(data);// 3) write data to the file
	        fr.close();    // 4) close the file
		} catch (IOException e) {
			
			e.printStackTrace();
		}  // 2) open filewriter  for file object 
    	
    	
        System.out.println("DONE");
    }

  

}
