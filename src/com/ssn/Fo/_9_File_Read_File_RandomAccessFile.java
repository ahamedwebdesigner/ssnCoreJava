package com.ssn.Fo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class _9_File_Read_File_RandomAccessFile{

    public static void main(String[] args) throws IOException {
    	
    	String fileName = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\Fo\\TEST\\HellowJava.txt";
    	RandomAccessFile file = new RandomAccessFile(fileName, "r");
    	String str;
    	while ((str = file.readLine()) != null) {
    		System.out.println(str);
    	}
    	file.close();	
    }
}
