package com.lara;
public class Employee
{
	private String fname;
	private int age;
	
	public Employee()
	{
		System.out.println("Employee()");
	}
	public Employee(String fname)
	{
		System.out.println("Employee(String fname)");
	}
	public String getfname() {
		System.out.println("getfname");
		return fname;
	}
	public void setfname(String fname) {
		System.out.println("setfname");
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
