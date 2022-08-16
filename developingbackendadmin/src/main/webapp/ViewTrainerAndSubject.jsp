<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Subject"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Display Classes records using JSTL</h2>
<table border="1">
	<tr>
	<th>SUBID</th>
	<th>SUBName</th>
	<th>SUBTrainer</th>
	</tr>
<core:forEach items="${sessionScope.listOfSubject}" var="subject">
	<tr>
		<td><core:out value="${subject.subid}"></core:out> </td>
		<td><core:out value="${subject.subname}"></core:out> </td>
		<td><core:out value="${subject.tsubid}"></core:out></td>
		
	</tr>
</core:forEach>
</table>
<a href="Home.jsp">Main</a>
</body>
</html>
