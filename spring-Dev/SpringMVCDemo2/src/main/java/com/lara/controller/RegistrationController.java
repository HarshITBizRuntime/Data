package com.lara.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.lara.entity.Education;
import com.lara.entity.Gender;
import com.lara.entity.Person;
import com.lara.entity.Skill;
import com.lara.services.EducationService;
import com.lara.services.GenderService;
import com.lara.services.PersonService;
import com.lara.services.SkillService;
@Controller
public class RegistrationController {

	private SkillService skillService;
	private GenderService genderService;
	private EducationService educationService;
	private PersonService personService;

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@Autowired
	public void setSkillService(SkillService skillService) {
		this.skillService = skillService;
	}

	@Autowired
	public void setGenderService(GenderService genderService) {
		this.genderService = genderService;
	}

	@Autowired
	public void setEducationService(EducationService educationService) {
		this.educationService = educationService;
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView getRegistration() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("registration");
		List<Gender> genders = genderService.allGenders();
		List<Skill> skills = skillService.allSkills();
		List<Education> educations = educationService.allEducations();
		mav.addObject("allGenders", genders);
		mav.addObject("allSkills", skills);
		mav.addObject("allEducations", educations);
		mav.addObject("regisrationUser", new Person());
		System.out.println("from testSetUp");
		return mav;
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView ProcessRegistrationForm(@ModelAttribute("regisrationUser") @Valid Person p1, BindingResult errors) 
	{
		ModelAndView mav = new ModelAndView("addPersonSucess");
		if(errors.hasErrors())
		{
			
			mav.setViewName("registration");
			List<Gender> genders = genderService.allGenders();
			List<Skill> skills = skillService.allSkills();
			List<Education> educations = educationService.allEducations();
			mav.addObject("allGenders", genders);
			mav.addObject("allSkills", skills);
			mav.addObject("allEducations", educations);
			mav.addObject("regisrationUser",p1);
			System.out.println("from testSetUp");
			return mav;
		}
		personService.save(p1);
		return mav;
	}
}
