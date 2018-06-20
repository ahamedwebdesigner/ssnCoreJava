package com.ssn.xml.Jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class xmlApp1 {

	public static void main(String[] args) throws JAXBException {

		
		
		
		
		//JAXBContext context = JAXBContext.newInstance(Customer.class);
		JAXBContext context = JAXBContext.newInstance(CustomerList.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	   // Customer customer = new Customer("001", "scott", "Rob", 30);
	    //m.marshal(customer, System.out);
	    
		
		List<Customer> customer = new ArrayList<Customer>();
		Customer e1 = new Customer("001", "Steve", "Rob", 30);
		Customer e2 = new Customer("002", "scott", "Rob", 30);
		Customer e3 = new Customer("003", "mack", "Rob", 30);
 
		customer.add(e1);
		customer.add(e2);
		customer.add(e3);
 
		CustomerList customerList = new CustomerList();
		customerList.setCustomers(customer);
		 
		m.marshal(customerList, System.out);
	}

}
