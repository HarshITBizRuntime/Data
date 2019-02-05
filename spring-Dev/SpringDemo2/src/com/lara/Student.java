package com.lara;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean 
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
	public Student()
	{
		System.out.println("Student()");
	}
		@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("afterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("destroy");
		
	}
	
}
