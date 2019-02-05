package com.lara;
// Error
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class M2
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext acp = new ClassPathXmlApplicationContext("config.xml");
		Person p1 = (Person) acp.getBean("p2");
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
	}
}