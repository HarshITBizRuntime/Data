package com.lara;

public class NonStaticTest {
	public String test1() {
		System.out.println("from NonStaticTest.test1");
		return "hello";
	}
	public int test2(String arg0) {
		System.out.println("from NonStaticTest.test2:" + arg0);
		return 1000;
	}
	public int test3(String arg0, int arg1) {
		System.out.println("from NonStaticTest.test3:" + arg0 + ", " + arg1);
		return 1000;
	}
}
