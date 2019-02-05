package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class M3 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");		//above two lines r enough to interact with database
		String sql = "DELETE FROM SPR1";
		template.update(sql);//for dml cmds
		System.out.println("done");
		
	}

}
