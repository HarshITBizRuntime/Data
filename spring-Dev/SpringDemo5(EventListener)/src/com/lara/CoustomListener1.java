package com.lara;

import org.springframework.context.ApplicationListener;

public class CoustomListener1 implements ApplicationListener<CoustomEvent>
{
	@Override
	public void onApplicationEvent(CoustomEvent arg0) 
	{
		System.out.println("CoustomListener1 onApplicationEvent" + arg0);
	}	
}

/*
 ApplicationListener has a two event 
 1 ContextStartedEvent
 2ContextStopedEvent
  */
 