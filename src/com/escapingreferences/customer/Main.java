package com.escapingreferences.customer;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		// Note that this function will fail
//		records.getCustomers().clear();
				
		// Returns a read only version of the Customer object
		ICustomerReadOnly john = records.getCustomerByName("John");
		System.out.println(john.getName());
		
		for (ICustomerReadOnly next : records) {
			System.out.println(next);
		}
		
	}
	
}
