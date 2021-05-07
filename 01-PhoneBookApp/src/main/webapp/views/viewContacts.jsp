<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>View All Contats</h3>
		<table border=1>
			<tr>
				<td>ContactName</td>
				<td>ContactEmail</td>
				<td>ContactPhone</td>
				<td>Action</td>
			</tr>
			<c:forEach items="${contact}" var="co">
				<tr>
					<td>${co.contactname}</td>
					<td>${co.contactnumber}</td>
					<td>${co.contactemail}</td>
					<td>
					<a href="/edit?cid=${co.contactid}">EDIT</a> &nbsp
					<a href="/delete?cid=${co.contactid}">DELETE</a> 
					</td>
				</tr>
			</c:forEach>			
				
			
		</table>
</body>
</html>