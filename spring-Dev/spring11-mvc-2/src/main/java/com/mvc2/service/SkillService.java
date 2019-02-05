package com.mvc2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc2.dao.SkillDAO;
import com.mvc2.entity.Skill;

public class SkillService
{
	private SkillDAO skillDao;
	
	@Autowired
	public void setSkillDao(SkillDAO skillDao)
	{
		this.skillDao = skillDao;
	}
	
	public List<Skill> allSkills()
	{
		return skillDao.allSkills();
	}
}
