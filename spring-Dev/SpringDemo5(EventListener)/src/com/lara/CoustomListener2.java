package com.lara;
import org.springframework.context.ApplicationListener;
public class CoustomListener2 implements ApplicationListener<CoustomEvent>
{
	@Override
	public void onApplicationEvent(CoustomEvent arg0) 
	{
		System.out.println("CoustomListener2 onApplicationEvent" + arg0);
	}	
}
 