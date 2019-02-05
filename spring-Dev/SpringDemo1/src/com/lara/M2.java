package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M2
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // it is deprecation class
		Person p1  = (Person) bf.getBean("p1");
		Person p2  = (Person) bf.getBean("p1");		
		Person p3  = (Person) bf.getBean("p1");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("getSucess()");
	}
}
// when you change xml file score = "prototype" then main() it will generating new object