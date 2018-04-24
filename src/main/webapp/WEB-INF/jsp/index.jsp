<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 23.04.2018
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>My Spring App</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
