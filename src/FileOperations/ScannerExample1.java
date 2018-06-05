package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		
		//URL url = ScannerExample1.class.getProtectionDomain().getCodeSource().getLocation();
		
		//System.out.println(url);
		
		
		try {
			 
			File fileTobeRead = new File("C:\\BOX\\ssnCoreJava\\src\\FileOperations\\exampleFile.txt");
			System.out.println(fileTobeRead.length());
			
			Scanner scanner = new Scanner(fileTobeRead);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
