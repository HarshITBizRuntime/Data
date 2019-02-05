package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EducationDAO 
{
	private JdbcTemplate template;
	@Autowired
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	public List<Education> readAllEducations()
	{
		String sql = "select id , name from EducationSpring";
		List<Education> education = template.query(sql,new RowMapper<Education>()
			{
				public Education mapRow(ResultSet rs, int rowNum) throws SQLException 
				{
					Education e1 = new Education ();
					e1.setId(rs.getInt("id"));
					e1.setName(rs.getString("name"));
					return e1;
				}
			});
		return education;
	}
}
