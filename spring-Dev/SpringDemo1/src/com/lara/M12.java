package com.lara; //here we are not providing attribute wia Constructor injection in config.xml file as e4
					import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;// cons is call //object is create //only getters () are call and default value is printed
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M12
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Customer ct1  = (Customer) bf.getBean("ct1");
		System.out.println("Employee object e2s is readdy");
		String s1 = ct1.getFname();
		int i1 = ct1.getAge();
		Double d1 = ct1.getWeight();
		int [] marks = ct1.getMarks();
		String [] projects = ct1.getProjects();
		List<Long> mobileno =ct1.getMno();
		Set<String> em = ct1.getEmailids();
		Map<String,String> edu = ct1.getEdu();
		Address add = ct1.getAddress();
		System.out.println(add.getHno());
		System.out.println(add.getStname());
		Properties sk =ct1.getSkill();
		System.out.println("Student name:->" + s1);
		System.out.println("Student age:->" + i1);
		System.out.println("Student weight:->" + d1);
		System.out.println("Student marks:->" + Arrays.toString(marks));
		System.out.println("Student projects:->" + Arrays.toString(projects));
		System.out.println("Student Mobile No:->" + mobileno);
		System.out.println("Student emailId:->" + em);
		System.out.println("Student education:->" + edu);
		System.out.println("Student Skill:->" + sk);
	}
}
// some time it required object without data 