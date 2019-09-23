<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>List-of-Students-Using-JSTL</h3>
<hr>
	<table border="2">
	
	<tr>
		<th>RollNo</th><th>Name</th><th>Sem</th><th>Marks</th>
	<tr>
	<c:forEach var="student" items="${students}">
		<tr>
			<td>${student.sno}</td>
			<td>${student.name}</td>
			<td>${student.semester}</td>
			<td>${student.marks}</td>
			
	</c:forEach>
	</table>


<hr>
</body>
</html>