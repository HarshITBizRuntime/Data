package com.lara.dao;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.lara.entity.Person;
public class PersonDAO {
private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void save(Person p1)
	{
		  String sql1="SELECT max (id) as max_id FROM PersonSpringMVC2";
		  String sql2 = "Insert into PersonSpringMVC2(id,fname,"+
				  		"lname,age,gid,eid)"+ 
				  		"values(?,'"+ p1.getFname()+ "',"+"'"+p1.getLname()+"'," +
				  		p1.getAge()+","+p1.getGender()+","+
				  		p1.getEducation()+")";
		  String sql3= "Insert into PersonSkillSpringMVC2 values(?,?)";
		  Map<String,Object> map = template.queryForMap(sql1);
		  Integer maxID = 0;
		  if (map != null)
		  {
			  if (map.get("max_id") != null)
			  {
				  maxID = ((BigDecimal) map.get("max_id")).intValue();
			  }
		  }
		  maxID++;
		  template.update(sql2,new Object[] {maxID});
		  for (Integer skillId : p1.getSkill())
		  {
			  template.update(sql3, new Object [] {maxID,skillId});
		  }
		  System.out.println("person saved with is as " + maxID);
	}


}
