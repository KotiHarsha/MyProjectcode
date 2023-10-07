<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Registration</title>
<style>
.reg {
  font-size: 35px;
  color:rgb(0,8,14,1);
  text-align: center;
}

</style>
</head>
<body style="background-color:PaleGreen;">
    <h1>Registration </h1>
    
    <p>Please fill in this form to create an account.</p>
    <div class ="reg">
    <form action = "save" method="post">

    <label for="name"><b>Full Name</b></label>
    <input type="text" placeholder="Enter name" name="name" id="name" style ="font-size:25px;"  required ><br>

    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="email" id="email" style ="font-size:25px;"  required ><br>

    <address >
     <label for="state"><b>state</b></label>
     <input type="text" placeholder="Enter state" name="state" id="state" style ="font-size:25px;"  required ><br>
    <label for="city"><b>city</b></label>
     <input type="text" placeholder="Enter city" name="city" id="city" style ="font-size:25px;"  required ><br>
    <label for="street"><b>street</b></label>
     <input type="text" placeholder="Enter address" name="street" id="street" style ="font-size:25px;" required ><br>
    </address>
     
    <label for="Bname"><b>Branch Name</b></label>
    <input type ="text" name ="Bname" placeholder="Branch" style ="font-size:25px;" required><br> 

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw"  style ="font-size:25px;"  required><br>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat"  style ="font-size:25px;" required><br>
    <button type="submit" style ="font-size:25px;">Register</button>
    </form>
    </div>
     <a href="#">By creating an account you agree to our Terms and Condition </a>
    </body>
</html>
