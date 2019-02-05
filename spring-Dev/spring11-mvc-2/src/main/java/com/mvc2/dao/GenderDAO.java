package com.mvc2.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc2.entity.Gender;

public class GenderDAO
{
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	public List<Gender> allGenders()
	{
		String sql = "select id, name from gender";
		
		List<Gender> genders = template.query(sql, (ResultSet rs, int row) ->
		{ 
			Gender gender = new Gender();
			gender.setId(rs.getInt("id"));
			gender.setName(rs.getString("name"));
			return gender;
		});
		
		return genders;
	}
	
}
