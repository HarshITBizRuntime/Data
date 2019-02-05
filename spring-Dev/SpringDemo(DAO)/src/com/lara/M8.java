package com.lara;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M8 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		PersonDAO pDao = (PersonDAO) context.getBean("personDao");
		pDao.save("harshad", "Lara", 24, 70.5);
		System.out.println("done");
		
	}
}
//spring dao is jdbc template
//hibrnate dao is hibernate session obejt
/*for one table one dao class*/
