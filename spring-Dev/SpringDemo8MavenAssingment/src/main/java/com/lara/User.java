package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public User() 
    {
        super();
       }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String  age = request.getParameter("age");
		String gid = request.getParameter("gender");
//		out.println("First name is:->" + fname);  
//		out.println("Last name is:->" + lname);  
//		out.println("Age is:->" + age);  
//		out.println("Gender is:->" + gid);  
		Person p1 =  new  Person();
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		@SuppressWarnings("unused")
		GenderDAO gDao=(GenderDAO) context.getBean("genderDao");
		PersonDAO pDao=(PersonDAO) context.getBean("personDao");
		p1.setFname(fname);
		p1.setLname(lname);
		p1.setAge(age);
		p1.setGid(gid);
		pDao.save(p1);
		out.println("Record Sucessfull added ");
		System.out.println("done");

	}

}
