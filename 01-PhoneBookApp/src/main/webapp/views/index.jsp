<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Contact Details</h3>
${succ}

<form:form action="/addContact?contactid=${contact.contactid}" method="POST" modelAttribute="contact">
<table>
	<tr>
		<td>ContactName:</td>
		<td><form:input path="contactname" /></td>
	</tr>
	<tr>
		<td>ContactEmail</td>
		<td><form:input path="contactemail" /></td>
	</tr>
	<tr>
		<td>ContactNumber</td>
		<td><form:input path="contactnumber" /></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="AddContact"/></td>
	</tr>
	
</table>

</form:form>
<a href="/viewContact"> viewAllContacts</a>
</body>
</html>