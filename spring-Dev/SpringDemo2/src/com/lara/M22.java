package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M22 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("config2.xml");
		
		Manager obj = (Manager) appContext.getBean("mgr"); 
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getDoj());
	}
}
