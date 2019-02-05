<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<s:message code="dbSetup.success" />
<br />

<u>
	<h3>
		<s:message code="genders.title" />
	</h3>
</u>

<c:forEach var="gender" items="${allGenders}">
	${gender.id} &nbsp;&nbsp; ${gender.name} <br />
</c:forEach>
<br>

<u>
	<h3>
		<s:message code="skills.title" />
	</h3>
</u>

<c:forEach var="skill" items="${allSkills}">
	${skill.id} &nbsp;&nbsp; ${skill.name} <br />
</c:forEach>
<br>