package com.lara;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Util
{
	private static ApplicationContext context;
	static
	{
		context = new ClassPathXmlApplicationContext("config.xml");
	}
	public static Object getObject(String id)
	{
		return context.getBean(id);
	}
}
