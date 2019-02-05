package com.lara;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lara.entity.Education;
import com.lara.entity.Gender;
import com.lara.entity.Skill;
import com.lara.services.EducationService;
import com.lara.services.GenderService;
import com.lara.services.SkillService;

@Controller
public class TestController
{
	private SkillService skillService;
	@Autowired
	public void setSkillService(SkillService skillService) {
		this.skillService = skillService;
	}
	
	private GenderService genderService;
	
	@Autowired
	 public void setGenderService(GenderService genderService) {
		this.genderService = genderService;
	}
	
	private EducationService educationService;
	@Autowired
	public void setEducationService(EducationService educationService) {
		this.educationService = educationService;
	}
	
	@RequestMapping(value="/textSetup",method=RequestMethod.GET)
    public String testSetUp()
    {
    	System.out.println("from testSetUp");
    	return "sucess";
    }
	
	@RequestMapping(value="/textDbSetup",method=RequestMethod.GET)
	public ModelAndView testDatabaseSetup()
	{
		ModelAndView mav= new ModelAndView();
		List<Gender>genders =genderService.allGenders();
		List<Skill> skills=skillService.allSkills();
		List<Education>educations = educationService.allEducations();
		 mav.addObject("allGenders",genders);
		 mav.addObject("allSkills",skills);
		 mav.addObject("allEducations",educations);
		 mav.setViewName("dbSetUpSucess");
		 System.out.println("from testSetUp");
		 return mav;
		 
	}
}
