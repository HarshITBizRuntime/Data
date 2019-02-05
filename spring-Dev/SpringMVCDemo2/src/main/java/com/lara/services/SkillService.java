package com.lara.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lara.dao.SkillDAO;
import com.lara.entity.Skill;
public class SkillService 
{
	private SkillDAO skillDa0;
	@Autowired
	 public void setSkillDAO(SkillDAO skillDa0) {
		this.skillDa0 = skillDa0;
	}
	public List<Skill> allSkills()
	{
		return  skillDa0.allSkills();
	}
}
