package com.lara;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;;

public class Student {
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
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String[] getProjects() {
		return projects;
	}
	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	public List<Long> getMno() {
		return mno;
	}
	public void setMno(List<Long> mno) {
		this.mno = mno;
	}
	public Set<String> getEmailids() {
		return emailids;
	}
	public void setEmailids(Set<String> emailids) {
		this.emailids = emailids;
	}
	public Map<String, String> getEdu() {
		return edu;
	}
	public void setEdu(Map<String, String> edu) {
		this.edu = edu;
	}
	public Properties getSkill() {
		return skill;
	}
	public void setSkill(Properties skill) {
		this.skill = skill;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
