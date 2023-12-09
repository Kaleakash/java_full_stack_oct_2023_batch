<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String email,pass; %>
<%
	email = request.getParameter("email");
	pass = request.getParameter("pass");
	//RequestDispatcher rd1 = request.getRequestDispatcher("Home.jsp");
	//RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
	
	// We can write JDBC code. we need to convert maven and write jdbc code. 
	Class.forName("");
	Connection con = DriverManager.getConnection("", "", "");
	
	if(email.equals("akash@gmail.com") && pass.equals("akash@123")){
		out.println("sucessfully login");
		//rd1.forward(request, response);
		%>
			<jsp:forward page="Home.jsp"></jsp:forward>
		<%
	}else {
		out.println("failure try once again");
		//rd2.include(request, response);
			%>
			<jsp:include page="login.jsp"></jsp:include>
			<%
	}
	response.setContentType("text/html");
%>
</body>
</html>