<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/insert">
<h1>Contact Details</h1>
<label>Name</label>
<input type = text name = "name"></input>
<br></br>
<label>Email</label>
<input type = email name = "email"></input>
<br></br>
<input type = submit></input>
<a href = "http://localhost:8443/contact-audit/Update.jsp">Update Details</a>
<br></br>
${status }
</form>
</body>
</html>