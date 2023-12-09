<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to HTML Page</h2>
	<%!int a=10,b=20,sum; %>
<%
	//int a;
	//int b;
	//int sum = a+b;
	sum = a+b;
	System.out.println("Welcome to JSP message on console");
	out.println("<br/>Welcome to JSP");
	out.println("<br/>Sum of two number is "+sum);
	out.println("<br/>");
	out.println("<font color=red>Sum is "+sum+"</font>");
%>
<p>Sum of two number is <%=100+200 %></p>
<font color="green">Sum of <%=a %> and <%=b %> is <%=sum %></font>
<hr/>
<%
	out.println("Another scriptlet tag");
%>
</body>
</html>