<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/24/2024
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/bt3Servlet" method="post">
    <h1><%= "UserLogin" %></h1>
    <table class="table table_bordered">
        <tr>
            <td>UserName </td>
            <td><input type="text" name="username"> </td>
        </tr>
        <tr>
            <td>Password </td>
            <td><input type="text" name="password"> </td>
        </tr>
        <tr>
            <td><input type="submit" value ="Submit"> </td>
        </tr>


        <% String errorMessage=(String) request.getAttribute("errorMessage"); %>
        <% if (errorMessage !=null){ %>
        <div style="color: red;"><%= errorMessage%></div>
        <% } %>
    </table>
</form>

</body>
</html>
