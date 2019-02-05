package com.lara.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lara.entity.Skill;

public class SkillDAO {
	
private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	  public List<Skill> allSkills()
	  {
		  String sql="SELECT ID,NAME FROM SkillSpringMVC2";
		  List<Skill> skills=template.query(sql, (ResultSet rs,int row)->
		  {
			  Skill skill=new Skill();
			  skill.setId(rs.getInt("ID"));
			  skill.setName(rs.getString("NAME"));
			  return skill;
		  });
		  
		  return skills;
	  }

}
