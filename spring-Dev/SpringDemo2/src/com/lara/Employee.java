package com.lara;

public class Employee
{
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	public Employee()
	{
		System.out.println("Employee()");
	}
	
	public void init()
	{
		System.out.println("init()");
	}
	public void myDestroy()
	{
		System.out.println("myDestroy()");
	}
}
