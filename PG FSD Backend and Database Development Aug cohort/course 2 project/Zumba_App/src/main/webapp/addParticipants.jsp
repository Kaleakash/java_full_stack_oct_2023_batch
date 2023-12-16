<%@page import="java.util.Iterator"%>
<%@page import="com.zumba.bean.Batch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Participants Details</h2>
<form action="ParticipantsController" method="post">
<label>Participant Name</label>
<input type="text" name="pname"><br/>
<label>Age</label>
<input type="number" name="age"><br/>
<label>PhoneNumber</label>
<input type="number" name="phonenumber"><br/>
<select name="batchid">
<option>--Select Batch --</option>
<%
Object obj = session.getAttribute("listOfBatch");
List<Batch> listOfBatch = (List<Batch>)obj;
Iterator<Batch> li = listOfBatch.iterator();
while(li.hasNext()){
	Batch bb = li.next();
	%>
	<option value="<%=bb.getBatchid()%>"><%=bb.getBatchid() %>(<%=bb.getTime()%>)</option>
	<%
}
%>
</select><br/>
<input type="submit" value="Store Batch"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.html">Back</a>
</body>
</html>