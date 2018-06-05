package FileOperations;

import java.io.File;

public class Directory_2 {

	public static void main(String[] args) {
		//Make a directory
/*		File directory = new File("C:\\BOX\\ssnCoreJava\\src\\FileOperations\\tempdir");
		 
		boolean dirCreated = directory.mkdir();
 
		if (dirCreated) {
			System.out.println("Directory Created Successfully !!!");
		} else {
			System.out.println("Unable to create Directory");
		}*/
		
		
		// multiple diretories
		
		
		File directory = new File("C:\\BOX\\ssnCoreJava\\src\\FileOperations\\tempdir\\temp1\\temp3\\temp4");
		 
	/*	boolean multipleDirCreated = directory.mkdirs();
 
		if (multipleDirCreated) {
			System.out.println("All Directories Created Successfully !!!");
		} else {
			System.out.println("Unable to create Directory");
		}
		*/
		
		System.out.println("The directory "+directory.isDirectory());

	}

}
