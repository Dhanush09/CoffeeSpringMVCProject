<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: dkasarap
  Date: 9/14/2020
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="menu.css">
    <title style="text-align: center;font-family: sans-serif">Menu</title>
</head>
<body>
<style>
    body{
        background-image: url("data:image/png;base64,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");
        background-size:auto;
    }

</style>

<h1 style="text-align: center;font-family: sans-serif">Menu</h1>
<spring:form action="./order" method="post">
    <div align="center">
    <label class="coffee"><h3 style="text-align: center;font-family: 'Arial Black'">Available Coffee:</h3></label>
   <spring:select path="coffee_id" ><spring:options items="${coffeemenu}" itemLabel="coffee_name" /></spring:select><br><br>

    <label class="addons"><h3 style="text-align: center;font-family: 'Arial Black'">Available Addons:</h3></label>
<spring:select path="addon_id"><spring:options items="${addonmenu}" itemLabel="addon" /> </spring:select><br><br>

    <label class="size"><h3 style="text-align: center;font-family: 'Arial Black'">Available Sizes:</h3></label>
<spring:select path="size_id"><spring:options items="${sizemenu}" itemLabel="size" /> </spring:select><br><br>
    <label class="discount"><h3 style="text-align: center;font-family: 'Arial Black'">Available Discount:</h3></label>
<spring:input path="discount_id"/><br><br>
    <input type="submit" value="placeorder"style="horiz-align: center">
    </div>
</spring:form>
</body>
</html>