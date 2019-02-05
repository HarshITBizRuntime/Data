package com.lara;
import java.io.IOException;
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
	public void saveEmployee(Employee emp) throws IOException 
	{
		String sql = "Insert into EmployeeSpring3 values(?,?,?)";
		Object [] data=  {
						emp.getFname(),
						emp.getLname(),
						emp.getMyFile().getBytes()};
		template.update(sql,data);
		System.out.println("save sucessFully in EmployeeSpring3 Table");
	}
}
