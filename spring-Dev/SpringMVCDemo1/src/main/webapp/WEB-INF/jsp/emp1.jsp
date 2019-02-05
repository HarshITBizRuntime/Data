<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>

<s:form modelAttribute="empForm" enctype="multipart/form-data">
<c:message code="fname"></c:message><s:input path="fname"></s:input> <br/>
<c:message code="lname"></c:message><s:input path="lname"></s:input> <br/>
<c:message code="fileLable"></c:message> :<input type="file" name="myFile"/> <br/>
	<input type="submit" value="submit"/>
</s:form>

<!-- http://localhost:7070/SpringMVCDemo1/test7.jsp -->