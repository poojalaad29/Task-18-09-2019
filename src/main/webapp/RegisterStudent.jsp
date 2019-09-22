<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<form action="insertcontroller">
<body>

<h3 align="center">Student Register Form</h3>
<table align="center" cellspacing="5">
<tr><td>
Enter Sno. </td><td>  <input type="text" name="sno"></td>
</tr>
<tr><td>
Enter name </td><td>  <input type="text" name="name">
</td></tr>
<tr><td>
Enter Semester </td><td>   <input type="text" name="semester">
</td></tr>
<tr><td>
Enter Marks </td><td>  <input type="text" name="marks"></td></tr>

<tr><td>
<input type="submit" value="Register"></td></tr>

</table>
</body>
</form>
</html>