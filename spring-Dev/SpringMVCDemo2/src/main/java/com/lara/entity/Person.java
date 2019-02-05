package com.lara.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Person
{
	@NotEmpty
	private String fname;
	@NotBlank
	private String lname;
	@NotNull
	private Integer age;
	@NotNull
	private Integer gender;
	@NotNull
	private Integer [] skill;
	@NotNull
	private Integer education;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer[] getSkill() {
		return skill;
	}
	public void setSkill(Integer[] skill) {
		this.skill = skill;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	
}
