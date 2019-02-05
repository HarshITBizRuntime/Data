package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M21 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("config1.xml");
		
		Customer obj = (Customer) appContext.getBean("c1"); 
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
	}
}
