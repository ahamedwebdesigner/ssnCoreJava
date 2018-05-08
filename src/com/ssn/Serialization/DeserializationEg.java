package com.ssn.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEg {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		 String filename = "src/com/ssn/Serialization/emp1.txt";
		 
		// Reading the object from a file
         FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
          
         // Method for deserialization of object
         SerEmp  e1 = (SerEmp)in.readObject();
          
         System.out.println(e1);
         
         in.close();
         file.close();

	}

}
