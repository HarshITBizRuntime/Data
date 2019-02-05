package com.lara;
import org.springframework.context.ApplicationListener;
public class CoustomListener3 implements ApplicationListener<CoustomEvent>
{
	@Override
	public void onApplicationEvent(CoustomEvent arg0) 
	{
		System.out.println(" CoustomListener3 onApplicationEvent" + arg0);
	}	
}
 