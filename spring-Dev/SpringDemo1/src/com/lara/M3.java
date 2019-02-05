package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M3
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // it is deprecation class
		Person p1  = (Person) bf.getBean("p2");
		System.out.println(p1.getFname());
		System.out.println(p1.getAge());
		System.out.println(p1.getWeigth());
		System.out.println("getSucess()");
	}
}
// when you change xml file score = "prototype" then main() it will generating new object