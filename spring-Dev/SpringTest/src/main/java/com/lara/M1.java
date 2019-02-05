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
		EmployeeDAO eDao = (EmployeeDAO) context.getBean("EmployeeDao");
		CompanyDAO cDao = (CompanyDAO) context.getBean("CompanyDao");
		Scanner sc = new Scanner (System.in);
		Company c1 = new Company();
		System.out.print("Enter you  Eid :->");
		c1.setEid(sc.nextInt());
		System.err.println("Enter company name");
		c1.setCname(sc.next());
		System.out.print("Enter you  Cid :->");
		c1.setCid(sc.nextInt());
		c1.setEid(sc.nextInt());
		System.out.print("All Employees");
		for (Employee Employee : eDao.readAllEmployees())
		{
			System.out.print("enter "+ Employee.getId()+ "for ");
			System.out.print("enter "+ Employee.getName()+ "for ");
		}
		c1.setEid(sc.nextInt());
		cDao.save(c1);
		System.out.println("done");
	}
}
