package com.lara;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class M2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("done");
		
	}

}
