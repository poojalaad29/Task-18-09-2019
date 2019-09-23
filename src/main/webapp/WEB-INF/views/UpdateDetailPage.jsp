<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updation Form</title>
</head>
<form action="updatedetail">
<body>
<hr>
<h3 align="center">Student Register Form</h3>
<table align="center" cellspacing="5">
<tr><td>
Enter Sno. </td><td>  <input type="text" name="sno" value="${students.sno}"></td>
</tr>
<tr><td>
Enter name </td><td>  <input type="text" name="name" value="${students.name}">
</td></tr>
<tr><td>
Enter Semester </td><td>   <input type="text" name="semester" value="${students.semester}">
</td></tr>
<tr><td>
Enter Marks </td><td>  <input type="text" name="marks" value="${students.marks}"></td></tr>

<tr><td>
<input type="submit" value="Register"></td></tr>

</table>
</body>
</form>
</html>