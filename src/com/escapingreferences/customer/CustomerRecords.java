package com.escapingreferences.customer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	/*
	 * Prevents the caller from modify the original object
	 */
	
	public Map<String, Customer> getCustomers() {
		return Collections.unmodifiableMap(this.records);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 * 
	 * Adding an Iterator allows the caller to iterate through the records object without getting direct access to change the object.
	 * 
	 */
	
	@Override
	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
	
	public ICustomerReadOnly getCustomerByName(String name) {
		return this.records.get(name);
	}
}
