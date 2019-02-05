package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee
{
	
	private String fname;
	private String lname;
	private Address address;
	@Autowired
	public Employee (String fname,String lname,@Qualifier Address address)
	{
		
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		
	}	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Address getAddress() {
		return address;
	}
	
}
