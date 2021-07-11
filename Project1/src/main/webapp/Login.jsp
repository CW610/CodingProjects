<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP LOGIN</title>
</head>



<body>
	<form action="Login" method="post">
    <h1 align="center" style="margin-top: 5%">Login Form</h1>
    <table align="center" style="margin-top: 10%">
      <tr>
        <td>UserName</td>
        <td><input type="text" name="username"></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td>Job Title</td>
        <td><input type="text" name="jobtitle"></td>
      </tr>
      
      <tr>
        <td></td>
        <td><input type="submit" value="Submit" id="button-1" /></td>
      </tr>
    </table>
  </form>
</body>
</html>