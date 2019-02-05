package com.lara;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello2Controller 
{
	@RequestMapping(value="/hello5", method=RequestMethod.GET)
	public String getData(ModelMap map)
	{
		System.out.println("Form Hello2Controller Spring ModelMap cantainer ");
		map.put("fname","HarshIT");
		map.put("age",22);
		map.put("email","harshit.lara@gmail.com");
		return "sucess5.jsp";
	}
}
// ModelMap  is container .. it useed to send multiple Request form UI
// map container is obly reading and stroing ability
// framework creating one model object ..references is supplying of getData()then .. this method inside we are storing the al the entryies
// expresson lang it can used to print attributes 
// expresson using diff container like Request Response 