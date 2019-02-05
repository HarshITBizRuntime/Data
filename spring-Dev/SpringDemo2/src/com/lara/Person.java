package com.lara;

public class Person  
{
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Person()
	{
		System.out.println("Person()");
	}
	public Person(String fname)
	{
		this.fname = fname;
		System.out.println("Person(String)");
	}
}
