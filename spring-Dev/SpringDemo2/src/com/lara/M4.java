package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M4 
{	
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(1);
		Person p1 = (Person) appContext.getBean("p1");
		System.out.println(2);
		System.out.println(p1.getFname());
	}
}
