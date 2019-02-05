package com.lara;

import org.springframework.context.ApplicationEvent;
@SuppressWarnings("serial")
public class CoustomEvent extends ApplicationEvent
{
	private Object source;
	public CoustomEvent(Object source)
	{
		super(source);
		this.source =source;
	}
	public 	 Object getSource()
	{
		System.out.println("CoustomEvent");
		return source;
	}
	
}

 