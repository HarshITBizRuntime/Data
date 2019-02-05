package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class M1
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(cpr);
		System.out.println(1);
		Person p1 = (Person) beanFactory.getBean("p1");
		System.out.println(2);
		System.out.println(p1.getFname());
	}
}//setter injuction always require no arg constructor
