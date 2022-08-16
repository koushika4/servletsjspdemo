<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Class Details</h2>
<form action="ClassController" method="post">
<label>CId</label>
<input type="number" name="cid"><br/>
<label>CName</label>
<input type="text" name="cname"><br/>
<input type="submit" value="Store Classes">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp">Main</a>
</body>
</html>
