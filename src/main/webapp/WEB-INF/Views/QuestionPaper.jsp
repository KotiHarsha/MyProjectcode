<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Questions</title>
<style>
.que {
  font-size: 30px;
  color:rgb(0,8,14,1);
}
</style>
</head>

<body style =  "background-color:LightGoldenRodYellow">
<form>
<p>Choose your favorite Web language:</p>
  <input type="radio" id="html" name="fav_language" value="HTML">
  <label for="html">HTML</label><br>
  <input type="radio" id="css" name="fav_language" value="CSS">
  <label for="css">CSS</label><br>
  <input type="radio" id="javascript" name="fav_language" value="JavaScript">
  <label for="javascript">JavaScript</label><br><br>
</form>
<form>
<p>Choose your favorite Programming language:</p>
  <input type="radio" id="java" name="fav_language" value="JAVA">
  <label for="java">Java</label><br>
  <input type="radio" id="c" name="fav_language" value="C">
  <label for="c">C</label><br>
  <input type="radio" id="python" name="fav_language" value="python">
  <label for="python">Python</label><br><br>
</form>
<form>
<p>Choose your the correct statement</p>
  <input type="radio" id="s1" name="fav_language" value="S1">
  <label for="s1">Java is Platform dependent</label><br>
  <input type="radio" id="s2" name="fav_language" value="S2">
  <label for="s2">Java is Platform Independent</label><br>
  <input type="radio" id="S3" name="fav_language" value="S3">
  <label for="S3">HTML is not a Markup Language</label><br><br>
 </form>
<form>
<p>Choose the correct Java frame works:</p>
  <input type="radio" id="SB" name="fav_language" value="SB">
  <label for="SB">SpringBoot</label><br>
  <input type="radio" id="hib" name="fav_language" value="hib">
  <label for="hib">Hibernate</label><br>
  <input type="radio" id="ss" name="fav_language" value="ss">
  <label for="ss">Struts</label><br><br>
 </form>
 <form action = "submit" method="post">
  <Button >Submit</Button>
</form>
</body>
</html>