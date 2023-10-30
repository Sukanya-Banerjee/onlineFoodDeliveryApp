<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
</head>
<body>
    <div align="center">
        <h1><u>Customer List</u></h1>
        <table border="1">
            <tr>
                <th>Customer ID</th>
                <th>Customer Name</th>
                <th>Address</th>
                <th>Contact Number</th>
                <th>Email</th>
                <th>Status</th>
            </tr>
            <c:forEach items="${customerList}" var="customer">
                <tr>
                    <td>${customer.customerId}</td>
                    <td>${customer.customerName}</td>
                    <td>${customer.address}</td>
                    <td>${customer.contactNumber}</td>
                    <td>${customer.email}</td>
                    <td>${customer.status}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>