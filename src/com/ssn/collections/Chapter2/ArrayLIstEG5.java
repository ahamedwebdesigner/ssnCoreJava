package com.ssn.collections.Chapter2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ArrayLIstEG5 {

	public static void main(String[] args) {
		//differance between ListIterater  and Iterator
		
		
		////////////////////////////////////////////////////////////////
		//        ArrayList 
		////////////////////////////////////////////////////////////////
		
		// 1) create array list 
		ArrayList list = new ArrayList();
		
		// 2) add elements
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("Four");
        list.add("Five");
 
        System.out.println("=============================use of iterator  arraylist =====================");
        //3) Traversing list elements using Iterator
        Iterator iterator1 = list.iterator();
 
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        
        System.out.println("=============================(1)use of ListIterator  arraylist =====================");
        
        System.out.println("==============(a) Treversing forverd=============");
        //Yout can get index using list iterater
        ListIterator listIterator1 = list.listIterator();
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.nextIndex()+" : "+listIterator1.next());
        }

        System.out.println("==============(b) Treversing backword=============");
        while (listIterator1.hasPrevious()) {
            //Getting index of previous element
        	System.out.println(listIterator1.previousIndex()+" : "+listIterator1.previous());
        }
        
        
		////////////////////////////////////////////////////////////////
		//        Queue 
		////////////////////////////////////////////////////////////////
        //1) Create queue object
        Queue queue = new PriorityQueue();
        queue.add("one");
        queue.add("Three");
        queue.add("two");
        queue.add("Four");
        
        System.out.println("===================================use of iterator  Queue ----------------");
       
        //3) Traversing list elements using Iterator
        Iterator queueIterator = queue.iterator();
 
        while (queueIterator.hasNext()){
            System.out.println(queueIterator.next());
        }
        
        //Error:  Compile time error, there is no such method in Queue
        // ListIterator listIterator2 = queue.listIterator(); 

		////////////////////////////////////////////////////////////////
		//        Queue 
		////////////////////////////////////////////////////////////////
        
        Set set = new HashSet();
        set.add("ONE");
        set.add("TWO");
        set.add("THREE");
        set.add("FOUT");
        
        System.out.println("===================================Iterating Set using iterater ----------------");
        //3) Traversing list elements using Iterator
        Iterator setIterator = set.iterator();
 
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        
        //Error:  Compile time error, there is no such method in Queue
        //ListIterator setIterator2 = set.listIterator(); 
       
	}

}
