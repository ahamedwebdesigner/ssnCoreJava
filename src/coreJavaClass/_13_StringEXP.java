package coreJavaClass;

public class _13_StringEXP {

	public static void main(String[] args) {
		
		String e = "JDK"; 
		String f = new String("JDK"); 
		
		System.out.println(e==f);
		System.out.println(e.equals("JDK"));
		System.out.println(e.equals("JDK"));
		System.out.println(e.equals(new String("JDK")));
		System.out.println("=================================");
		//System.out.println(new StringBuffer("JDK"));
		System.out.println(e.equals(new StringBuffer("JDK").toString()));
		System.out.println(e.equals(new StringBuilder("JDK").toString()));
		System.out.println("=================================");
		System.out.println(new StringBuilder("JDK").toString().equals(new StringBuilder("JDK").toString()));
		
		

	}

}
