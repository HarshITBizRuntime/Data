package com.lara;

import java.util.Properties;
import java.util.Set;

public class M13 {
	public static void main(String[] args) {
		Properties pr = System.getProperties(); 
		@SuppressWarnings("rawtypes")
		Set keys = pr.keySet();
		for (Object obj : keys) {
			System.out.print(obj + ":");
			System.out.println(pr.get(obj));
		}
	}
}
// getProperties() returning