package com.lara;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class M5
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext acp = new ClassPathXmlApplicationContext("config.xml");
		Customer c1 = (Customer) acp.getBean("c1");
		System.out.println(c1.getFname());
		System.out.println(c1.getLname());
		acp.registerShutdownHook();
	}
}