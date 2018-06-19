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
<title>Orders Page</title>
</head>
<% Customer customer = (Customer) session.getAttribute("customerkey");  %>
<body>
<h1> Orders </h1>
<form action=""></form>
<table>
<tr>
<th>Shoe Name </th>
<th>Gender </th>
<th>Shoe Size </th>
<th>Quantity</th>
<th>Total Price </th>
<th> </th>
<% Order order = new Order();
	OrderDAO orderDAO = new OrderDAO();
	Shoes shoes = new Shoes();
	ShoesDAO  shoesDAO = new ShoesDAO();
	int shoeID = Integer.parseInt(request.getParameter("order"));
	int quantity = Integer.parseInt(request.getParameter("orderQuantity"));
	order.setCustomer_ID(customer.getCustomerID());
	order.setShoe_ID(shoeID);
	order.setOrderQuantity(quantity);
	order.setSubTotal(order.getOrderQuantity()*shoes.getPrice());
	orderDAO.addOrder(order);
	
		out.write("<tr>");
		out.write("<td>"+shoes.getShoeName() + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"</td>");
		out.write("<td>"+shoes.getGender() + "</td>");
		out.write("<td>"+shoes.getShoeSize() + "</td>");
		out.write("<td>"+order.getOrderQuantity() + "</td>");
		out.write("<td>"+order.getSubTotal()+"</td>");
	

%>

</tr>
</body>
</html>