<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>User Form</h1>
	<form action="process-form" Method=POST>
		<label>First Name</label>
			<input type="text" id="firstName" name="firstname" placeholder="firstname"/><br>
		<label>Last Name</label>
			<input type="text" id="lastName" name="lastname" placeholder="last name"><label>First Name</label><br>
		<label>User Name</label>	
			<input type="text" id="userName" name="username" placeholder="User Name"/><br>
		<label>Gender</label>
			<input type="radio" id="gender" name="gender" value="male"/>
			<input type="radio" id="gender" name="gender" value="female"/>
		<label>Phone Number</label>
			<input type="text" id="phoneNumber" name="contactInfo.phoneNumber"phoneNumber"" placeholder="Phone Number"/><br>
		<label>Email</label>
			<input type="email" id="email" name="contactInfo.email" placeholder="Phone Number"/><br>
		<label>LinkedIn</label>
			<input type="url" id="linkedIn" name="ContactInfo.linkedIn" placeholder="linkedIn"/><br>
		<label>Social Security Number</label>
			<input type="text" id="ssn" name="privateInfo.ssn" placeholder="Social Security Number"/><br>
		<label>Credit Card Number</label>
			<input type="text" id="ccn" name="privateInfo.ccn" placeholder="Credit Card Number"/><br>
		<label>Date of Birth</label>
			<input type="date" id="dob" name="privateInfo.dob" placeholder="CDate of Birth"/><br>
		<label>Register</label>
			<input type="submit" id="register" name="register" value="register"/>				
	</form>
</body>
</html>