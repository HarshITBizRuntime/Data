package com.lara;
import org.springframework.jdbc.core.JdbcTemplate;//add oracle driver also in buildpath ...to interact with databasee
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class M1
{
	public static void main(String[] args) 
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmds.setUsername("system");
		dmds.setPassword("harshit");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");		//it is programmatic configuration. it s not advisable
																//DriverManagerDataSource builtin perfect bean class..
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dmds);		//JdbcTemplate is also builtin bean class
		String sql = "CREATE TABLE SPR1(SNO NUMBER)";
		template.execute(sql);
		System.out.println("Table Created");
		
	}

}
/* if we change any passwros or username..then everry time u have to modify the java file
 * which is not advishable..so develop a seperate configuration file..and 
 * we know how to provide values to properties of a bean class..
 * by using ioc set the properties in xml file.*/
