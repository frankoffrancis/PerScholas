<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import ="springwork.model.User" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%User u = (User)session.getAttribute("userkey");  %>
<body>
<h1>Change User Information</h1>
<div class="container">
	<form action="submit_changes" method="POST">
		<div class="sub_field">
			<label>User Name</label> <input type="text" id="user"
				name="username" value=<%=u.getUsername() %> />
		</div>
		<div class="sub_field">
			<label>Password</label> <input type="passowrd" id="pass"
				name="pass" value=<%=u.getPassword() %> />
		</div>
		<div class="sub_field">
			<label>Email</label> <input type="text" id="email"
				name="email" value=<%=u.getEmail() %> />
		</div>
		<div class="btn">
			<input type="submit" name="submit" value="Change Info" />
		</div>
	</form>
</div>
</body>
</html>