package com.lara;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class AppStart implements ApplicationListener<ContextStartedEvent>
{
	public void onApplicationEvent(ContextStartedEvent arg0)
	{
		System.out.println("From AppStart Listener");
	}
}

/*
 ApplicationListener has a two event 
 1 ContextStartedEvent
 2ContextStopedEvent
  */
 