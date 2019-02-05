package com.lara.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lara.entity.Gender;

public class GenderDAO {
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	  public List<Gender> allGenders()
	  {
		  String sql="SELECT ID,NAME FROM GenderSpringMVC2";
		  List<Gender> genders=template.query(sql, (ResultSet rs,int row)->
		  {
			  Gender gender=new Gender();
			  gender.setId(rs.getInt("ID"));
			  gender.setName(rs.getString("NAME"));
			  return gender;
		  });
		  
		  return genders;
	  }
}
