package com.lara;

import javax.annotation.PostConstruct;

public class Customer
{
	
	private String fname;
	private String lname;
	public Customer(String fname,String lname)
	{
		System.out.println("customer()");
		this.fname = fname;
		this.lname = lname;
	}
	public void setFname(String fname) {
		System.out.println("set first name");
		this.fname = fname;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		System.out.println("set last name");
		this.lname = lname;
	}	
	@PostConstruct
	public void init()
	{
		System.out.println("init()");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}

	
}
