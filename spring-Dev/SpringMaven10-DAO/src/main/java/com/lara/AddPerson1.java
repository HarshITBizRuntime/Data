package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddPerson1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public AddPerson1() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{PrintWriter out = response.getWriter();
	EducationDAO eDao = (EducationDAO) Util.getObject("educationDao");
	List<Education> educations = eDao.readAllEducations();
	out.println("<form method='post'>");
	out.println("Firstname :-> <input type='text' name='fname'/> <br>");
	out.println("Lastname :-> <input type='text' name='lname'/> <br>");
	out.println("Education:-> ");
	out.println("<select name='education'>");
	for (Education education : educations)
	{
		out.print("<option value='" +  education.getId() + "'>");
		out.print(education.getName() + "</option>");

	}
	out.println("</select>");
	out.println("<input type='submit' value='submit'/>");
	out.println("</form>");
	out.print("sucess");
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String education = request.getParameter("education");
	Person p1  = new Person();
	p1.setFname(fname);
	p1.setLname(lname);
	p1.setEid(Integer.parseInt(education));
	PersonDAO pDao = (PersonDAO) Util.getObject("personDao");
	pDao.save(p1);
	PrintWriter out = response.getWriter();
	out.println(fname +"Record Added Person");
	}

}
