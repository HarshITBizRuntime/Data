package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M16 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("config2.xml");
		
		Object obj = appContext.getBean("prs"); 
		System.out.println(obj);
	}
}
