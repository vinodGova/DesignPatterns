<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="AuthenticationController" method="POST">
  <h1 align="center">Login Page</h1>
  <table align="center">
  <tr><td>Enter UserName</td><td><input type="text" name="uName"></td></tr>
  <tr><td>Enter Password</td><td><input type="password" name="pwd"></td></tr>
  <tr><td><input type="submit" value="login">
  
  </table>
   </form>
</body>
</html>