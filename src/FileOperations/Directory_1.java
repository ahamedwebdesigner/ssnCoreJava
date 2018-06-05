package FileOperations;

import java.io.File;

public class Directory_1 {

	public static void main(String[] args) {
		// list Files in a Directory

		
		File file = new File("C:\\BOX\\ssnCoreJava\\src\\FileOperations");
		 
		String[] listOfFiles = file.list();
 
		if (listOfFiles == null || listOfFiles.length == 0) {
			System.out.println("No Files or Directories found");
		} else {
			for (String fileName : listOfFiles) {
				File newFile = new File(file, fileName);
				boolean isDir = newFile.isDirectory();
				if (isDir) {
					System.out.println(fileName + " is a Directory");
				} else {
					System.out.println(fileName + " is a File");
				}
			}
		}
		
		
		
	}

}
