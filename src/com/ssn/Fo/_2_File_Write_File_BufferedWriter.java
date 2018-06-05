package com.ssn.Fo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _2_File_Write_File_BufferedWriter {

    public static void main(String[] args) throws IOException {
    	

        String data = "I will write this String to File in Java";       	// data to write in file
        int noOfLines = 10000;
        // 1) open file object
 
        File file = new File("C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\BufferedWriter.txt");
       
        // Note: every time it creates new file
        //FileWriter fr = new FileWriter(file);
        
        //Note: appends data  at the end of the file
        FileWriter fr = new FileWriter(file,true);        //1. carete file filewriter
        BufferedWriter br = new BufferedWriter(fr);   //2. carete bufferwriter
        String dataWithNewLine=data+System.getProperty("line.separator"); //3. apped line seperater 
        br.write(dataWithNewLine);
        
        
        //writig dat 10000 times
 /*       for(int i = noOfLines; i>0; i--){
            br.write(dataWithNewLine);
        }*/
        
        br.close();
        fr.close();
        
 System.out.println("file careated  ");
    }

  

    
  
    
    
}
