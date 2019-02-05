package com.lara; //here we are not providing attribute wia Constructor injection in config.xml file as e4
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M16
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Manager m1  = (Manager) bf.getBean("m1");
		System.out.println("Employee object e2s is readdy");
		String s1 = m1.getFname();
		int i1 = m1.getAge();
		Address add = m1.getAddress();
		System.out.println("Student name:->" + s1);
		System.out.println("Student age:->" + i1);
		System.out.println("Student House No:->" + add.getHno());
		System.out.println("Student address Streetname:->" + add.getStname());
	}
}