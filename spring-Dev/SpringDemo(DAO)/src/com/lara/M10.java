package com.lara;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M10
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		//PersonDAO pDao = (PersonDAO) context.getBean("personDao");
	 PersonDAO1 pDao = (PersonDAO1) context.getBean("personDao");
	//	PersonDAO2 pDao = (PersonDAO2) context.getBean("personDao");
	//	PersonDAO3 pDao = (PersonDAO3) context.getBean("personDao");
		List <Person > persons = pDao.readAllPerson();
		for (Person person : persons )
		{
				System.out.println(person.getFname());
				System.out.println(person.getLname());
				System.out.println(person.getAge());
				System.out.println(person.getWeight());
		}
		System.out.println("done");
	}
}
