package com.lara;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class M6 {

	public static void main(String[] args) 
	{
		JdbcTemplate template = Util.getTemplate();
		String sql = "SELECT * FROM SPR3";
		List<Map<String, Object>> list = template.queryForList(sql);//for dql .query methods
		System.out.println(list);
	}
}
/*list of map objects..one map object for one row ..
 * every map objct havingn two entris..one is key and tohte is value
 * column name as key and column value as value
 * framework is uing resultset
 * till now ..we have used sql commans in our clinet program......we shoud not do lke this..
 * generate seperate DAOclass for every table...and create all the methods to interact wiht databese for that table
 * all sql commands in DAO class...not in client program....if any changes in table means ..just change the DAO ...
 * no need to change the client programs
 * dAo wl automatially get jdbctemplate
 * */
