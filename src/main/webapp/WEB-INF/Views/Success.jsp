<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body Style = "background-color:MediumSeaGreen">
<H1>Registration Successfully</H1>
<h2>Your Registration number is  <%= request.getAttribute("rnum")  %></h2>
<p><a href ="index.jsp">click here to login to go login page</a></p>
</body>
</html>