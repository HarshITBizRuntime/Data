package com.lara;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class M1 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		GenderDAO gDao = (GenderDAO) context.getBean("genderDao");
		PersonDAO pDao = (PersonDAO) context.getBean("personDao");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		Person p1 = new Person();
		System.out.print("Enter First name :->");
		p1.setFname(sc.next());
		System.out.print("Enter Last name :->");
		p1.setLname(sc.next());
		System.out.print("Enter Age:->");
		p1.setAge(sc.next());
		System.out.print("All Genders");
		for (Gender gender : gDao.readAllGenders())
		{
			System.out.print("enter "+ gender.getId()+ "for ");
			System.out.print("enter "+ gender.getName()+ "for ");
		}
		p1.setGid(sc.next());
		pDao.save(p1);
		System.out.println("done");
	}
}
