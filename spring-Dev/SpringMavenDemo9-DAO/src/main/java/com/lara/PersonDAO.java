package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAO 
{

	private JdbcTemplate template;
	@Autowired
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	public void save(Person p1) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO PERSONSPRING2 VALUES(");
		sql.append("'"+p1.getFname()+"',");
		sql.append("'"+p1.getLname()+"',");
		sql.append("'"+p1.getEid()+"')");
		template.update(sql.toString());
	}
}
