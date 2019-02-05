package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class M2 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");		//above two lines r enough to interact with database
		String sql = "INSERT INTO SPR1 VALUES(101)";
		template.update(sql);
		System.out.println("1 record added");
		
	}
}
/*to interact with database we need jdbc template.to get this..we need to have applicationcontext obje
 * execute() for ddl
 * update() for dml*/
