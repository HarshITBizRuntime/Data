package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M15 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("config2.xml");
		
		Object obj = appContext.getBean("pr"); 
		System.out.println(obj);
	}
}
// to avoid confusion comment all beans except pr beans.