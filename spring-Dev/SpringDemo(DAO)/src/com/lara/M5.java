package com.lara;

import org.springframework.jdbc.core.JdbcTemplate;

public class M5 {

	public static void main(String[] args) 
	{
		JdbcTemplate template = Util.getTemplate();
		String sql1 = "INSERT INTO SPR3 VALUES (1, 'harshit')";
		String sql2 = "INSERT INTO SPR3 VALUES (2, 'lara1')";
		String sql3 = "INSERT INTO SPR3 VALUES (3, 'harshad')";
		String sql4 = "INSERT INTO SPR3 VALUES (4, 'lara')";
		template.update(sql1);
		template.update(sql2);
		template.update(sql3);
		template.update(sql4);
		System.out.println("4 recored Added");
	}
}

/*spring dao is internally using jdbc 
any framework to interact with databas....they r suing jdbc internally.....*/