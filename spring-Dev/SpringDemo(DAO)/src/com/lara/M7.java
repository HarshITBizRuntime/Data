package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M7 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		PersonDAO pDao = (PersonDAO) context.getBean("personDao");
		pDao.setUp();
		System.out.println("done");
		
	}
}
/*util class is only to get jdbctemplate..we dont require that hre...we need persondao*/
