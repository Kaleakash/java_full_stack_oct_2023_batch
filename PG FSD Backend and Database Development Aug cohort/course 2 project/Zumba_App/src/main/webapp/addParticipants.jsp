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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h2>Add Participants Details</h2>
<form action="ParticipantsController" method="post"  class="form-group">
<input type="hidden" name="operation" value="add"><br/>
<label>Participant Name</label>
<input type="text" name="pname" class="form=control"><br/>
<label>Age</label>
<input type="number" name="age" class="form=control"><br/>
<label>PhoneNumber</label>
<input type="number" name="phonenumber" class="form=control"><br/>
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
<input type="submit" value="Store Batch" class="btn btn-success"/>
<input type="reset" value="reset" class="btn btn-info"/>
</form>
<br/>
<a href="index.html">Back</a>
</div>
</body>
</html>