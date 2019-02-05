package com.lara;
import java.util.List;
import java.util.Scanner;
public class M4
{
	public static void main(String[] args) 
	{
		EducationDAO eDao = (EducationDAO) Util.getObject("educationDao");
		PersonDAO pDao = (PersonDAO) Util.getObject("personDao");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		Person p1 =new Person();
		System.out.print("Enter the firstname:->");
		p1.setFname(sc.next());
		System.out.print("Enter the lastname:->");
		p1.setLname(sc.next());
		System.out.print("Enter the id:->");
		List<Education> educations = eDao.readAllEducations();
		for (Education education : educations)
		{
			System.out.print("Enter  " +  education.getId() + "  For");
			System.out.print("Enter  " + education.getName() + " For ");
		}
		p1.setEid(sc.nextInt());
		pDao.save(p1);System.out.println("Record Added Person");
	}
}
