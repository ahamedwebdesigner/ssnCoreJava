package com.ssn.collections.hashmap;

import java.util.HashMap;



public class HashMapApp2 {

	public static void main(String[] args) {
		////// 
		HashMap<Integer, Employee> contactHashMap = new HashMap<Integer, Employee>();
		contactHashMap.put(1,new Employee("Tom", 80000));
		contactHashMap.put(10,new Employee("scott", 770000));
		contactHashMap.put(5,new Employee("blis", 60000));
		contactHashMap.put(11,new Employee("blake", 30000));
		System.out.println(contactHashMap);
	}

}





class Employee {
	String name;
    int salary;
 
    public Employee(int salary) {
        this.salary = salary;
    }
 
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String toString() {
        return this.name + "-" + salary;
    }
 
    public String getName() {
        return this.name;
    }
 
    public Integer getSalary() {
        return new Integer(this.salary);
    }
 
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee another = (Employee) obj;
            if (this.name.equals(another.name)
                    && this.salary == another.salary) {
                        return true;
            }
        }
 
        return false;
    }
 
    public int hashCode() {
        return 31 * name.hashCode() + salary;
    }
}

