<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Update Employee Salary</h4>
<form action="EmployeeController" method="post">
	<input type="hidden" name="operation" value="update">
	<label>Id</label>
	<input type="number" name="id"/><br/>
	<label>Salary</label>
	<input type="number" name="salary"/><br/>
	<input type="submit" value="update employee salary"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.html">Back</a>
</body>
</html>