package com.lara; //here we are not providing attribute in config.xml file as e4
					// cons is call //object is create //only getters () are call and default value is printed
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M10
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Employee e1  = (Employee ) bf.getBean("e4");
		System.out.println("Employee object e2s is readdy");
		String s1 = e1.getfname();
		System.out.println(s1);
		int i1 = e1.getAge();
		System.out.println(i1);
		System.out.println("getSucess()");
	}
}
// some time it required object without data 