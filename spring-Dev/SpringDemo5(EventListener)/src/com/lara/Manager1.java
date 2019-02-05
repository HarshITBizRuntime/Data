package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml") ;
		System.out.println(1);
		context.start();
		System.out.println(2);
		context.stop();
		System.out.println(3);
	}
}

/*
 ApplicationListener has a two event 
 1 ContextStartedEvent
 2ConstextStopedEvent
 
 
  */
 