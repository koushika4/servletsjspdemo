<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Home Page ${sessionScope.obj} </h2>
<a href="StoreTrainer.jsp">Add Trainer Details</a><br/>
<hr/>
<a href="TrainerController">View All Trainer Details</a><br/>
<hr/>
<a href="StoreStudent.jsp">Add Student Details</a><br/>
<hr/>
<a href="StudentController">View All Student Details</a> <br/>
<hr/>
<a href="StoreClass.jsp">Add Class Details</a> <br/>
<hr/>
<a href="ClassController">View All Class Details</a> <br/>
<hr/>
<a href="StoreSubjcet.jsp">Add Subject Details</a> <br/>
<hr/>
<a href="SubjectController">View All Subject Details</a> <br/>
<hr/>
<a href="AssignTrainertoStudent.jsp">Assign Trainer to student</a><br/>
<hr/>
<a href="viewTrainerAndStudents.jsp">View Trainer and student</a><br/>
<hr/>
<a href="AssignTrainertoSubject.jsp">Assign Trainer to Subject</a><br/>
<hr/>
<a href="ViewTrainerAndSubject.jsp">View Trainer and Subject</a>
</body>
</html>
