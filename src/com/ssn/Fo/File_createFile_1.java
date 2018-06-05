package com.ssn.Fo;

import java.io.File;
import java.io.IOException;

public class File_createFile_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("dataxxx.txt");
		// 1) carete file
		boolean createNewFile = file.createNewFile();
		System.out.println("File Created = "+createNewFile);
		
		// 2) delet this file
		//boolean delete = file.delete();
		//System.out.println("File deleted = " + delete);
		
		
		
		
	}

}
