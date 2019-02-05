package com.lara;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO 
{
	private JdbcTemplate template;
	@Autowired
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	public List<Employee> readAllEmployees()
	{
		String sql = "select id , name , cname from EmployeeTest";
		List<Employee> employee = template.query
			(sql,(ResultSet rs , int rowNum) ->
											{
												Employee e1 = new Employee ();
												e1.setId(rs.getInt("id"));
												e1.setName(rs.getString("name"));
												e1.setCname(rs.getString("cname"));
												return e1;
											});
		return employee;
	}
}
