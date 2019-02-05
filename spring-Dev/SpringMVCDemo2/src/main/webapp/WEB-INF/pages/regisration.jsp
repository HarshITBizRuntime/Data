<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<ul>
	<h1>
		<s:message code="regisration.title"></s:message>
	</h1>
</ul>
<!DOCTYPE HTML>
<html>
<head>
<title>Registeration Form</title>
</head>
<body>
	<f:form modelAttribute="regisrationUser">
		<s:message code="regisration.fname"></s:message>
		<f:input path="fname" />
		<br>
		<s:message code="regisration.lname"></s:message>
		<f:input path="lname" />
		<br>
		<s:message code="regisration.age"></s:message>
		<f:input path="age" />
		<br>
		<s:message code="regisration.gender"></s:message>
		<f:radiobuttons path="gender" items="${allGenders}" itemValue="id" itemlabel="name" />
		<br>
		<s:message code="regisration.skill"></s:message>
		<f:checkboxes path="skill" items="${allSkills}" itemValue="id"
			itemlabel="name" />
		<br>
		<s:message code="regisration.education"></s:message>
		<f:select path="education" items="${allEducations}" itemValue="id"
			itemlabel="subject" />
		<br>
	<input type="submit" value="submit" />
	</f:form>
</body>
</html>
