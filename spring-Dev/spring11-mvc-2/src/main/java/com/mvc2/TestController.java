package com.mvc2;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc2.entity.Gender;
import com.mvc2.entity.Skill;
import com.mvc2.service.GenderService;
import com.mvc2.service.SkillService;

@Controller
public class TestController
{
	private GenderService genderService;
	private SkillService skillService;
	
	@Autowired
	public void setGenderService(GenderService genderService)
	{
		this.genderService = genderService;
	}
	
	@Autowired
	public void setSkillService(SkillService skillService)
	{
		this.skillService = skillService;
	}
	
	@RequestMapping(value="/testSetup", method=RequestMethod.GET)
	public String testSetUp()
	{
		System.out.println("from setup");
		return "setUpSuccess";
	}
	
	@RequestMapping(value="/testDbSetup", method=RequestMethod.GET)
	public ModelAndView testDatabaseSetUp()
	{
		List<Gender> genders = genderService.allGenders();
		List<Skill> skills = skillService.allSkills();
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("allGenders", genders);
		mav.addObject("allSkills", skills);
		mav.setViewName("dbSetupSuccess");
		
		System.out.println("from db setup");
		return mav;
	}
}
