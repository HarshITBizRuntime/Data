package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class M3 
{
	public static void main(String[] args)
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory beanFactory = new XmlBeanFactory(cpr);
		System.out.println(1);
		Person p1 = (Person) beanFactory.getBean("p3");
		System.out.println(2);
		System.out.println(p1.getFname());
	}
}
//constructor injucted  data can be modified 