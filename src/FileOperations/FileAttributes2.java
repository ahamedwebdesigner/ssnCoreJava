package FileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileAttributes2 {

	public static void main(String[] args) {
		
	
		Path path = Paths.get("C:\\BOX\\ssnCoreJava\\src\\FileOperations\\exampleFile.txt");
		Path path2 = Paths.get("C:\\BOX\\ssnCoreJava\\src\\FileOperations");
		
		 
		try {
			BasicFileAttributes attrs = Files.readAttributes(path,BasicFileAttributes.class);
			BasicFileAttributes attrs2 = Files.readAttributes(path2,BasicFileAttributes.class);
 
			 //FileTime fileTime = attrs.creationTime();
 
			//System.out.println("The Creation Time of File is ::" + fileTime);
			System.out.println("The Creation Time of File is ::" + attrs.creationTime());
			System.out.println("size of File is ::" + attrs.size());
			System.out.println("lastAccessTime of File is ::" + attrs.lastAccessTime());
			System.out.println("lastAccessTime of File is ::" + attrs.lastModifiedTime());
			System.out.println("attrs isRegularFile  ::" + attrs.isRegularFile());
			System.out.println("attrs isDirectory ::" + attrs.isDirectory());
			
			
			System.out.println("attrs2  isDirectory ::" + attrs2.isDirectory());
		} catch (IOException e) {
			System.err.println("Error occurred");
		}

	}

}
