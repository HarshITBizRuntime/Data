package com.lara; //here we are not providing attribute wia Constructor injection in config.xml file as e4
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M14
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Author auth1  = (Author) bf.getBean("auth2");
		System.out.println("Employee object e2s is readdy");
		String s1 = auth1.getFname();
		int i1 = auth1.getAge();
		Address add = auth1.getAddress();
		System.out.println("Student name:->" + s1);
		System.out.println("Student age:->" + i1);
		System.out.println(add.getHno());
		System.out.println(add.getStname());
	}
}
// some time it required object without data 