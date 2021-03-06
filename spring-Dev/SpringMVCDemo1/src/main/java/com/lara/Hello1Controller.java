package com.lara;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello1Controller 
{
	@RequestMapping(value="/hello1", method=RequestMethod.GET)
	public String sayHello1()
	{
		System.out.println("Form Spring Controller");
		return "sucess1.jsp";
	}
	
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	public String sayHello2()
	{
		System.out.println("Form Spring sayHello2() Controller");
		return "sucess2.jsp";
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/hello3", method=RequestMethod.POST) // RAWServlets
	public String processHello3(HttpServletRequest request) // if is first Approachers we RAWServlets
	{
		String s1 = request.getParameter("fname");
		System.out.println("Form Spring processHello3() Controller");
		return "sucess3.jsp";
	}
	@RequestMapping(value="/hello4", method=RequestMethod.GET)
	public String processHello4(HttpServletResponse response)
	{
		response.setIntHeader("Refresh", 5);
		System.out.println("Form Spring processHello4() Controller");
		return "sucess4.jsp";
	}
}

// yo can do any kind of configuratin here
// 