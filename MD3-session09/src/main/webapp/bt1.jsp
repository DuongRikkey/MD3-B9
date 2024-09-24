<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/24/2024
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/bt1Servlet" method="post">
    <table class="table table_bordered">
        <tr>
            <td>Product Description </td>
            <td><input type="text" name="productDescription"> </td>
        </tr>
        <tr>
            <td>Price </td>
            <td><input type="number" name="price"> </td>
        </tr>
        <tr>
            <td>Discount Payment </td>
            <td><input type="number" name="DiscountPercent"> </td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value ="calculate discount"> </td>
        </tr>
    </table>
</form>
</body>
</html>
