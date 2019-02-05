package com.lara;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M17 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("config2.xml");
		
		Object obj = appContext.getBean("prs"); 
		Properties pr = (Properties) obj; 
		Set keys = pr.entrySet();
		for (Object key : keys) {
			System.out.print(key + ":");
			System.out.println(pr.get(key));
		}
	}
}
