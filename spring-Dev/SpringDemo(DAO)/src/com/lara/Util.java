package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Util 
{
	private static JdbcTemplate template;
	static
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		template = (JdbcTemplate) context.getBean("template");
	}
	public static JdbcTemplate getTemplate()
	{
		return template;
	}
	//jdbtemplate is a singlton class..so using sib
}
