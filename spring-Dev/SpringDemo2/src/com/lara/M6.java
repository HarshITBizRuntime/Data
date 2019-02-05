package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M6 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(1);
		Employee emp1 = (Employee) appContext.getBean("emp1");
		System.out.println(2);
		System.out.println(emp1.getFname());
		System.out.println(3);
		System.out.println(emp1.getLname());
		appContext.registerShutdownHook();
	}
}
