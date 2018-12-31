package com.escapingreferences;


public class Customer implements ICustomerReadOnly {
	private String name;

	/* (non-Javadoc)
	 * @see com.escapingreferences.ICustomerReadOnly#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}
	
	// Copy constructor
	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name;
	}
	
	/* (non-Javadoc)
	 * @see com.escapingreferences.ICustomerReadOnly#toString()
	 */
	@Override
	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
