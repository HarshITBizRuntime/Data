package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class M1 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Person p1 = (Person)ac.getBean("p1");
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
	}
}
