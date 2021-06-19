package com.dit.los.operation;

import java.util.ArrayList;

import com.dit.los.customer.Customer;
import com.dit.los.customer.PersonalInformation;

public interface DB {
	
	public static ArrayList<Customer> getNegativeCustomers(){
		
		ArrayList<Customer> negativeCustomers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setId(1010);
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName("Tim");
		pd.setLastName("Jackson");
		pd.setPhone("2222");
		pd.setPanCard("BX10000");
		pd.setVoterId("A111");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		customer = new Customer();
		customer.setId(1020);
		pd = new PersonalInformation();
		pd.setFirstName("Tom");
		pd.setLastName("Dahl");
		pd.setPhone("2222");
		pd.setPanCard("BX10000");
		pd.setVoterId("A111");
		pd.setEmail("tom@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		return negativeCustomers;
		
	}
}
