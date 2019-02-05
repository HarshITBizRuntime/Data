package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M9 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		PersonDAO pDao = (PersonDAO) context.getBean("personDao");
		pDao.update("harshad", "Temp", 30, 81.8);
		System.out.println("done");
		
	}
}
