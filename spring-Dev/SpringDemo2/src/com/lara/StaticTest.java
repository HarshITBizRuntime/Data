package com.lara;

public class StaticTest {
	public static String test1() 
	{
		System.out.println("from test1");
		return "hello";
	}
	public static String test2(int i)
	{
		System.out.println("from test2:" + i);
		return "hi";
	}
	public static String test3(int arg0, String arg1) 
	{
		System.out.println("from test3:" + arg0 + ", " + arg1);
		return "blr";
	}
}
