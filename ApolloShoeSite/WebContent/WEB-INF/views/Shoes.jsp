<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "apollo.model.*" %>
     <%@ page import = "apollo.dao.*" %>
     <%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "javax.servlet.http.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Shoes of the Gods</title>
</head>
<% Customer customer = (Customer) session.getAttribute("customerkey");  %>


<body>
<h1> The greatest Shoes in history</h1>
<nav>
<a href =""> Home</a>
<a href = "Customer"> Customer Page</a>
<a href="About"> About Us</a>
</nav>

<label> Shoes </label>
<form action=""></form>
<select name="shoes ">

	<div name="ShoesAvaliable"> 
		<tr>
			    <th>Shoe Name</th>
			    <tr></tr>
			    <th>Shoe Size</th>
			    <th>Gender</th>
			    <th>Price</th>
			    <th>Category Name</th>
			  </tr>

	
	
	</div>

</select>

</body>
</html>