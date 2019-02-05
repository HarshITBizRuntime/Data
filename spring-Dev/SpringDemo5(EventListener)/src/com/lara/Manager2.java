package com.lara;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager2 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml") ;
		CoustomPublisher cp  =(CoustomPublisher) context.getBean("cp");
		System.out.println(1);
		cp.publishEvent();
		System.out.println(3);
	}
}

/*
 ApplicationListener has a two event 
 1 ContextStartedEvent
 2ConstextStopedEvent
 
 
  */
 