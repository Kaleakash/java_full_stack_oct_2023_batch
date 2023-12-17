<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h3>Batch and Participants Details</h3>
<table border="1" class="table table-stripped">
	<tr>
		<th>TypeOfBatch</th>
		<th>Time</th>
		<th>SName</th>
		<th>Age</th>
	</tr>

<%
Object obj = session.getAttribute("listBP");
List<Object[]> list = (List<Object[]>)obj;
Iterator<Object[]> li = list.iterator();
while(li.hasNext()){
	Object oo[]=li.next();
	%>
	<tr>
		<td><%=oo[0]%></td>
		<td><%=oo[1]%></td>
		<td><%=oo[2]%></td>
		<td><%=oo[3]%></td>
	</tr>
	<%
}
%>
</table>
<br/>
<a href="index.html">Back</a>
</div>
</body>
</html>


