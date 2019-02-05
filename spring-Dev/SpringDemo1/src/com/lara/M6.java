package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M6
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // it is deprecation class
		Person p1  = (Person) bf.getBean("p3");
		Person p2  = (Person) bf.getBean("p4");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("getSucess()");
	}
}
// some time it required object without data 