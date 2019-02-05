<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<s:message code="dbSetUp.sucess"/><br/>

<ul>
   <h1>
   <s:message code="genders.title"></s:message>
   </h1>
</ul>


<c:forEach  var="gender" items="${allGenders}">
 ${gender.id} &nbsp;&nbsp; ${gender.name} <br/>

</c:forEach>
<br/>

<ul>
   <h1>
   <s:message code="skills.title"></s:message>
   </h1>
</ul>


<c:forEach  var="skill" items="${allSkills}">
 ${skill.id} &nbsp;&nbsp; ${skill.name}<br/>

</c:forEach>

<ul>
   <h1>
   <s:message code="education.title"></s:message>
   </h1>
</ul>


<c:forEach  var="education" items="${allEducations}">
 ${education.id} &nbsp;&nbsp; ${education.subject}<br/>

</c:forEach>