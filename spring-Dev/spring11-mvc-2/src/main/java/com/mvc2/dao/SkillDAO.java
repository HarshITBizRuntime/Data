package com.mvc2.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

//import com.mvc2.entity.Gender;
import com.mvc2.entity.Skill;

public class SkillDAO
{
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	public List<Skill> allSkills()
	{
		String sql = "select id, name from skill";
		
		List<Skill> skills = template.query(sql, (ResultSet rs, int row) ->
		{ 
			Skill skill = new Skill();
			skill.setId(rs.getInt("id"));
			skill.setName(rs.getString("name"));
			return skill;
		});
		
		return skills;
	}
}
