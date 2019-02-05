package com.lara;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ApplicationStopListener implements ApplicationListener<ContextStoppedEvent>
{
	public void onApplicationEvent(ContextStoppedEvent arg0)
	{
		System.out.println("From ApplicationStopListener");
	}
}
