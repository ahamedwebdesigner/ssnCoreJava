package coreJavaClass;

public class _2_ByteDataType {

	public static void main(String[] args) {
		  
			byte a = 126;
		   
	       
	        System.out.println(a); // byte is 8 bit value and max allowed value is 126
	        a++;                  
	        System.out.println(a);
	    
	        // On incrementing one to the max value converts to min allowed value
	        // Noot It overflows here because byte can hold values from -128 to 127
	        
	        a++;
	        System.out.println(a);
	         
	        // Looping back within the range
	        a++;
	        System.out.println(a);

	}

}
