package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
public class CompanyDAO 
{
		private JdbcTemplate template;
		@Autowired
		public void setTemplate(JdbcTemplate template) 
		{
			this.template = template;
		}
		public void save(Company c1) 
		{
			StringBuffer sql = new StringBuffer();
			sql.append("Insert into CompanyTest values(");
			sql.append("'" + c1.getCid()+ "',");
			sql.append("'" + c1.getCname()+ "',");
			sql.append(c1.getEid() + ")");
			template.update(sql.toString());
		}
}
