package com.lara;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name="p1")
	public Person getPerson()
	{
		Person p1 = new Person();
		p1.setFname("harsh");
		p1.setLname("Lara");
		return p1;				
	}
	
}
