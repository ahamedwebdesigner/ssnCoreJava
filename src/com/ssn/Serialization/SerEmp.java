package com.ssn.Serialization;

import java.io.Serializable;

public class SerEmp implements Serializable, Comparable{
	public String name;
	public int id;
	public SerEmp(String name, int id) {
	
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "SerEmp [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return id ;
	}

	
	

}
