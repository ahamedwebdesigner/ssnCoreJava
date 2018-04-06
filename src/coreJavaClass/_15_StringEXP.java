package coreJavaClass;


/*
 *
 * ----------------------------------------------------------------------------------
                  String                    StringBuffer         StringBuilder
----------------------------------------------------------------------------------                 
Storage Area | Constant String Pool         Heap                   Heap 
Modifiable   |  No (immutable)              Yes( mutable )         Yes( mutable )
Thread Safe  |      Yes                     Yes                     No
 Performance |     Fast                 Very slow                  Fast
----------------------------------------------------------------------------------


 */
public class _15_StringEXP {
	
	public static void main(String[] args) throws InterruptedException {
		
		// final StringBuilder sb = new StringBuilder("hi");
		 final StringBuffer sb = new StringBuffer("hi");
		
		 Runnable runner = new Runnable() {
			 public void run() {
				 
				/* for(int i =1 ;i<=10;i++) {
					 System.out.println("Frome thread 1 :"+i);
				 }*/
				 
			    sb.append("Hello");
		        System.out.println( "Frome thread "+sb.toString());
			   
			  }
			};
			
			Thread t = new Thread(runner);
			t.start();
			
			
			 /*for(int i =1 ;i<=10;i++) {
				 System.out.println("Frome maine 1 :"+i);
			 }*/
			Thread.sleep(3000);
			sb.append("all");
			System.out.println(sb.toString());
		    
			System.out.println("======================");
		    System.out.println(sb.toString());
		    
		    
		
	}
	

}
