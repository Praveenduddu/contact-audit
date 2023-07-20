<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/update">
<h1>Update Contact Details</h1>
<label>Id</label>
<input type = number name = "id" value = ${values.get("pk_id") }></input>
<br></br>
<label>Name</label>
<input type = text name = "name" value = ${values.get("name") }></input>
<br></br>
<label>Email</label>
<input type = email name = "email" value = ${values.get("email") }></input>
<br></br>
<input type = submit></input>
</form>
</body>
</html>