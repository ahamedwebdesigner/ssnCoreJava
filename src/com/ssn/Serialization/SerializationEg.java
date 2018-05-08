package com.ssn.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEg  {

	public static void main(String[] args) throws IOException {
		
		SerEmp e1 = new SerEmp("syed",1002);
		
		  String filename = "src/com/ssn/Serialization/emp1.txt";
		//Saving of object in a file
          FileOutputStream file = new FileOutputStream(filename);
          ObjectOutputStream out = new ObjectOutputStream(file);
          
          // Method for serialization of object
          out.writeObject(e1);
          
          out.close();
          file.close();
           
          System.out.println("Object has been serialized");
	}

}
