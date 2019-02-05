package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext acp = new ClassPathXmlApplicationContext("config.xml");
		Person p1 = (Person) acp.getBean("p1");
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
	}
}