package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeeController 
{
	private EmployeeDAO eDao;
	@Autowired
	public void seteDao(EmployeeDAO eDao) 
	{
		this.eDao = eDao;
	}
	@RequestMapping(value="/addEmp", method=RequestMethod.GET)
	public ModelAndView getViewForAddEmployee()
	{
		Employee emp = new Employee();
		ModelAndView mav = new  ModelAndView ();
		mav.addObject("empForm",emp);
		mav.setViewName("emp1");
		return mav;
	}
	@RequestMapping(value="/addEmp", method=RequestMethod.POST)
	public String processAddEmployee( @ModelAttribute("empForm") Employee emp) throws Exception
	{
		String fname = emp.getFname();
		String lname = emp.getLname();
		MultipartFile myFile = emp.getMyFile();
		byte[] allBytes = myFile.getBytes();
		System.out.println("firstname:->" + fname);
		System.out.println("Lastname:->" + lname);
		System.out.println(myFile.getOriginalFilename() + " :->" + allBytes.length);
		eDao.saveEmployee(emp);
		return "empAddSucess2";
	}
	
}
