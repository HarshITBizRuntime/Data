package com.lara.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lara.dao.EducationDAO;
import com.lara.entity.Education;
public class EducationService
{
	private EducationDAO educationDao;
	
	@Autowired
	public void setEducationDao(EducationDAO educationDao) {
		this.educationDao = educationDao;
	}
	
	public List<Education> allEducations()
	{
		return educationDao.allEducations();
	}

}
