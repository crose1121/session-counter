<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
	<h2>You have visited https://localhost:8080 <%=session.getAttribute("count") %> times.</h2>
	<p><a href="/">Test again?</a></p>
	<a href="/counter/reset">Reset the counter</a>
</body>
</html>