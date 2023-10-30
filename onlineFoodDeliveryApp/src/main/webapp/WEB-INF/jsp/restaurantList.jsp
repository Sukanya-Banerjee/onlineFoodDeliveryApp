<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Restaurant List</title>
</head>
<body>
<div align="center">
    <h1><u>Restaurant List</u></h1>
    <table border="1">
        <tr>
            <th>Restaurant ID</th>
            <th>Restaurant Name</th>
            <th>Restaurant Type</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${restaurantList}" var="restaurant">
            <tr>
                <td>${restaurant.restaurantId}</td>
                <td>${restaurant.restaurantName}</td>
                <td>${restaurant.type}</td>
                <!--  <td>
                    <a href="/restaurant/details/${restaurant.restaurantId}">Details</a>
                </td>-->
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>