package com.lara;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CoustomPublisher implements ApplicationEventPublisherAware
{
	private ApplicationEventPublisher publisher;
	public CoustomPublisher ()
	{
		System.out.println("CoustomPublisher()");
	}
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) 
	{
		System.out.println("from ApplicationEventPublisher");
		this.publisher = arg0;
	}
	public void publishEvent()
	{
		CoustomEvent cEvent = new CoustomEvent("Harsh");
		publisher.publishEvent(cEvent);
			
	}
}

/*
 ApplicationListener has a two event 
 1 ContextStartedEvent
 2ContextStopedEvent
  */
 