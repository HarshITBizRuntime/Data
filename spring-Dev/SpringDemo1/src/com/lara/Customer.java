package com.lara;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;;

public class Customer{
	private String fname;
	private int age;
	private Double weight;
	private int [] marks;
	private String [] projects;
	private List<Long> mno;
	private Set<String> emailids;
	private Map<String,String> edu;
	private Properties skill;
	private Address address;
	
	public String getFname() {
		return fname;
	}
	public int getAge() {
		return age;
	}
	public Double getWeight() {
		return weight;
	}
	public int[] getMarks() {
		return marks;
	}
	public String[] getProjects() {
		return projects;
	}
	public List<Long> getMno() {
		return mno;
	}
	public Set<String> getEmailids() {
		return emailids;
	}
	public Map<String, String> getEdu() {
		return edu;
	}
	public Properties getSkill() {
		return skill;
	}
	public Address getAddress() {
		return address;
	}
public Customer(String fname,int age,Double weight,int [] marks,String [] projects,List<Long> mno,
			    Set<String> emailids,Map<String,String> edu,Properties skill,Address address	)
				{
					this.fname = fname;this.age = age;this.weight = weight;
					this.marks = marks;this.projects = projects;this.mno = mno;
					this.emailids = emailids;this.edu = edu;this.skill = skill;
					this.address = address;
				}
}
