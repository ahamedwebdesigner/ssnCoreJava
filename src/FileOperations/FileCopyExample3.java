package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

/* working wint files */



public class FileCopyExample3 {

	public static void main(String[] args) throws IOException   {
		File sourceFile = new File("C:\\BOX\\ssnCoreJava\\src\\FileOperations\\exampleFile.txt");
		 
		File destinationFile = new File("C:\\BOX\\ssnCoreJava\\src\\FileOperations\\ResuletFile.txt");
		
		//coppyFileData(sourceFile, destinationFile);
		coppyFileData2(sourceFile, destinationFile);
		System.out.println("Java 7 makes File Copy easy .. File copied !!!");
	}
		
	
	public static void  coppyFileData2(File sourceFile, File destinationFile) throws IOException {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(sourceFile);
			output = new FileOutputStream(destinationFile);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
 
			System.out.println("File copied !!!");
		} finally {
			input.close();
			output.close();
		}
		
	}
	
	public static void  coppyFileData(File sourceFile, File destinationFile) throws IOException {
		Files.copy(sourceFile.toPath(), destinationFile.toPath());
		
	}

}
