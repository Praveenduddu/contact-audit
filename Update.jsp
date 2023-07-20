<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/get">
<label>Enter Id : </label>
<input type = number name = "id" ></input>
<input type = submit>
<input type="submit" value="Delete" onclick="form.action='/delete';">
</form>
</body>
</html>