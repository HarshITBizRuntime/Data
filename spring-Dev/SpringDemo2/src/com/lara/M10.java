package com.lara;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class M10
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(1);
		Book b1 = (Book) appContext.getBean("b4"); 
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
	}
}
