package com.lara;

import org.springframework.jdbc.core.JdbcTemplate;

public class M4 {

	public static void main(String[] args) 
	{
		JdbcTemplate template = Util.getTemplate();
		String sql = "CREATE TABLE SPR3(SNO NUMBER, NAME VARCHAR2(90))";
		template.execute(sql);
		System.out.println("table Created");
	}
}
