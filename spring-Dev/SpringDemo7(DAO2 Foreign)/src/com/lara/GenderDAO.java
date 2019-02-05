package com.lara;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
				(sql,(ResultSet rs , int rowNum) ->
												{
													Gender g1 = new Gender ();
													g1.setId(rs.getInt("id"));
													g1.setName(rs.getString("name"));
													return g1;
												});
			return gender;
		}
	
}
