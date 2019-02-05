package com.lara;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class M11
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config1.xml");
		Object obj = appContext.getBean("t1"); 
		System.out.println(obj);

	}
}
