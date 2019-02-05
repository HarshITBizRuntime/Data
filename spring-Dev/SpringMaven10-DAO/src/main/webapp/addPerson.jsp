<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<form action="AddPerson2" method="post">
                <table border='0'>
                    <tr>
                        <th colspan="2">Login Form</th>
                    </tr>
                    <tr>
                        <td>FirstName:</td>
                        <td><input type="text" name="fname" maxlength="15" required></td>
                    </tr>
                   <tr>
                        <td>LastName:</td>
                        <td><input type="text" name="lname" maxlength="15" required></td>
                    </tr>
					   <tr>
                        <td>Education:</td>
                        <td><select name="education">
                        		<c:forEach items="${AllEducation}" var="educations">
                        		<option value='${educations.id}'>
                        		${educations.name}
                        		</option>
                        		</c:forEach>
                        		</select>
                        		<br/>
                        	</td>
                    </tr>	
                    <tr>
                        <td><input type = submit value ="Login"></td>
                    </tr>
                </TABLE>
            </FORM>