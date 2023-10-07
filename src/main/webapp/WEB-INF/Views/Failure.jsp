<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>failure</title>
</head>
<body style = "background-color:YellowGreen">
<% if (request.getAttribute("u") == "false") { %>
<h1> Password does not match</h1>
<H1> OR</H1>
<h1> Password Criteria doesn't Meet</h1>
<a href = "Register">
Please click here to Go back and Try again
</a>
<% } else  { %>
<h1>Please enter Valid User Credentials </h1>
<a href = "index.jsp"><br><br>
Please click here to GO to Login Page
</a>
<H1>OR</H1>
<a href = "Register">
Please click here to register
</a>

<%} %>
</body>
</html>