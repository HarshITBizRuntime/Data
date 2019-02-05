package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M18 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("config2.xml");
		
		Object obj = appContext.getBean("m1"); 
		System.out.println(obj);
	}
}
