package com.ssn.xml.Jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "CustomerListNEW")
public class CustomerList {
	private List<Customer> customer;

	public List<Customer> getCustomers() {
		return customer;
	}

	public void setCustomers(List<Customer> customer) {
		this.customer = customer;
	}


	 
	
}
