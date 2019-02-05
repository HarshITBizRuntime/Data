package com.lara; //here we are not providing attribute wia setter injection in config.xml file as e4
					import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;// cons is call //object is create //only getters () are call and default value is printed
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M11
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Student st1  = (Student) bf.getBean("st1");
		System.out.println("Employee object e2s is readdy");
		String s1 = st1.getFname();
		int i1 = st1.getAge();
		Double d1 = st1.getWeight();
		int [] marks = st1.getMarks();
		String [] projects = st1.getProjects();
		List<Long> mobileno =st1.getMno();
		Set<String> em = st1.getEmailids();
		Map<String,String> edu = st1.getEdu();
		Address add = st1.getAddress();
		System.out.println(add.getHno());
		System.out.println(add.getStname());
		Properties sk =st1.getSkill();
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(d1);
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(projects));
		System.out.println(mobileno);
		System.out.println(em);
		System.out.println(edu);
		System.out.println(sk);
		System.out.println("getSucess()");
	}
}
// some time it required object without data 