package com.lara;

import org.springframework.beans.factory.annotation.Required;

public class Person 
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
	@Required
	public void setLname(String lname) {
		this.lname = lname;
	}
}
