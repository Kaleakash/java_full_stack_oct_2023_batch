<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//Object obj = request.getAttribute("obj");
Object obj = session.getAttribute("obj");
String name = (String)obj;
out.println("<br/> In JSP Page");
out.println("name is "+name);
%>
</body>
</html>