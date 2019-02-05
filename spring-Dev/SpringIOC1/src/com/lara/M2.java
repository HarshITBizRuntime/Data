package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M2 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Person p  = (Person) bf.getBean("p1");
		System.out.println(p.getFname());
		System.out.println(bf);
		System.out.println("getSucess()");
	}

}
