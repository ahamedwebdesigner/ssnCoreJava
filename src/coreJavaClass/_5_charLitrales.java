package coreJavaClass;

public class _5_charLitrales {

	public static void main(String[] args) {
		char ch1;
		ch1 = 'X';
		
	
		System.out.println("ch1 contains " + ch1);

		ch1++; // increment ch1  
		// note we can increment char litral
		System.out.println("ch1 is now " + ch1);
		
		System.out.println("======================example 1=====================");
		//2
		char   c1  = '\n'; // Assigns a linefeed to c1 
		char   c2  = '\"'; // Assigns double quote to c2
		//char   c3  = '\a'; // A compile-time error. Invalid character escape sequence
		System.out.println(c1);
		System.out.println(c2);
		
		
		    //3
			System.out.println("==============================example 2 ====================");
		    char ch4 = 'a'; 			// signle character literl within signle quote
		    int i = ch4;
	        char ch2 =  97; 			// It is an Integer literal with octal form
	        char ch3 = '\u0061'; 		// Unicode representation
	        System.out.println(ch4); //a
	        System.out.println(ch2);
	        System.out.println(ch3);
	        System.out.println(i);  
	        // Escape character literal
	        System.out.println( "Hello guy\'s  is a symbol");


	}

}
