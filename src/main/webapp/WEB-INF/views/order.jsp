<%--
  Created by IntelliJ IDEA.
  User: dkasarap
  Date: 9/14/2020
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="order.css">
    <title>FinaL Bill</title>
</head>
<body>
<style>
    body {
        background-image: url("https://wallpapercave.com/wp/OorYKnI.jpg");
        background-size: auto;
    }
</style>
<br><br><br><br><br><br><br><br>
<h1 style="text-align: center;font-family: sans-serif">Final bill :${Bill}</h1>
<h5 style="text-align: center;font-family: 'Arial Black'">Coffee Price :${CofeePrice}</h5>
<h5 style="text-align: center;font-family: 'Arial Black'">Addon Price : ${AddonPrice}</h5>
<h5 style="text-align: center;font-family: 'Arial Black'">Size Price : ${SizePrice}</h5>
<h5 style="text-align: center;font-family: 'Arial Black'">Discount : ${DiscountPrice}</h5>
<!--<form style="text-align: center" method="post" action="./index">
    <input type="submit" value="Back">
</form>-->
</body>
</html>
