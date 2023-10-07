<html>
<head>
<meta charset="UTF-8">
<title>Online Registration</title>
<style>
.log {
  font-size: 35px;
  color:rgb(0,8,14,1);
  text-align: center;
}
</style>
</head>
<body style="background-color:Beige;">
<h1 style = "font-size:70px; font-family:verdana; color:rgb(60,179,113); text-align: center;">
Welcome to Online Examination Portal</h1>
<div class = "log">
<form action = "Login" method = get>
<label for="Regname">Register ID</label>
<input type ="text" name ="reg" placeholder="Registration ID" style ="font-size:25px;" required><br>
 <label for="uname">User name</label>
<input type ="text" style ="font-size:25px;" name ="uname" placeholder="Enter username" required><br>
 <label for="Pword">Password</label>
<input type = "Password" style ="font-size:25px;" name= "pword" placeholder="Enter Password" required><br><br>
<input type = "Submit" value ="Login"  style ="font-size:26px; color:green;">
<input type = "Reset" value ="Reset" style ="font-size:26px; color:green;">
<p>Didn't have an account</p>
<a href = "Register"> 
<input type = "button" value = "Register" style ="font-size:28px; color:Blue;">
</a>
</form>
</div>
</body>
</html>
