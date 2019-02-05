package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M4
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext acp = new ClassPathXmlApplicationContext("config.xml");
		Employee s1 = (Employee) acp.getBean("e1");
		System.out.println(s1.getFname());
		System.out.println(s1.getLname());
		Address a1 = s1.getAddress();
		System.out.println(a1.getHno());
		System.out.println(a1.getSname());
	}
}