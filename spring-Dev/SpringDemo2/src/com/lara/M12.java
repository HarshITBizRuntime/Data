package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M12 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config1.xml");
		Object obj = appContext.getBean("t2"); 
		System.out.println(obj);
		Object obj1 = appContext.getBean("t3"); 
		System.out.println(obj1);
	}
}
// we are getting output from test1 method also because ApplicationContext is aggressive loading. 