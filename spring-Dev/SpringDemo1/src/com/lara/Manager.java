package com.lara;
public class Manager
{
	private String fname;
	private Integer age;
	private Address address;
	public String getFname()
	{
		return fname;
	}
	public Integer getAge() 
	{
		return age;
	}
	public Address getAddress() 
	{
		return address;
	}
	public Manager(String fname,Integer age,Address add) 
	{
		this.fname = fname;
		this.age = age;
		this.address = add;
	}
}