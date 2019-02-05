package com.mvc2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc2.dao.GenderDAO;
import com.mvc2.entity.Gender;

public class GenderService
{
	private GenderDAO genderDao;
	
	@Autowired
	public void setGenderDao(GenderDAO genderDao)
	{
		this.genderDao = genderDao;
	}
	
	public List<Gender> allGenders()
	{
		return genderDao.allGenders();
	}
	
}
