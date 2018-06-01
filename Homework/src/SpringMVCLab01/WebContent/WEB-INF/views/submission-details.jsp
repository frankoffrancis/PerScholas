<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<td>First Name</td>
		<td>${user.firstName}</td>
	</tr>
		<tr>
		<td>Last Name</td>
		<td>${user.lastName}</td>
	</tr>
		<tr>
		<td>User Name</td>
		<td>${user.userName}</td>
	</tr>
		<tr>
		<td>Gender</td>
		<td>${user.gender}</td>
	</tr>
		<tr>
		<td>Email</td>
		<td>${user.contactInfo.email}</td>
	</tr>
		<tr>
		<td>Last Name</td>
		<td>${user.lastName}</td>
	</tr>
		<tr>
		<td>LinkedIn</td>
		<td>${user.contactInfo.linkedInUrl}</td>
	</tr>
		<tr>
		<td>Social Security</td>
		<td>${user.pirvateInfo.ssn}</td>
	</tr>
		<tr>
		<td>Credit Card Information</td>
		<td>${user.pirvateInfo.ccn}</td>
	</tr>
		<tr>
		<td>Date of Birth</td>
		<td>${user.pirvateInfo.dob}</td>
	</tr>
	</table>
</body>
</html>