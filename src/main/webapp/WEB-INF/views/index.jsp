<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Cafe Dhanush</title>
	<style>
		body {
			background-image: url("https://blosh.nz/wp-content/uploads/2018/03/Coffee-cups-Rockingham-brown-latte-green-espresso-yellow-long-black.jpg");
			background-size: cover;
		}
	</style>
</head>
<body>
<h1 style="text-align: center;color: white;font-family: 'Arial Black'">Cafe Dhanush Welcomes You!</h1>
<form action="./menu" method="post" style="text-align: center">
	<input type="submit" value="Place Order" align="middle">
</form>
</body>
</html>