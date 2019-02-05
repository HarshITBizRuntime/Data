package com.lara;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class GenderDAO 
{
		private JdbcTemplate template;
		@Autowired
		public void setTemplate(JdbcTemplate template) 
		{
			this.template = template;
		}
		public List<Gender> readAllGenders()
		{
			String sql = "select id , name from GenderSpr";
			List<Gender> gender = template.query
				(sql,new RowMapper<Gender>() {
					public Gender mapRow(ResultSet rs, int rowNum) throws SQLException {
						Gender g1 = new Gender ();
						g1.setId(rs.getInt("id"));
						g1.setName(rs.getString("name"));
						return g1;
					}
				});
			return gender;
		}
	
}
