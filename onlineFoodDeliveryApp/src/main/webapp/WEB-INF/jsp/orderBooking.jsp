<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Booking</title>
</head>
<body>
    <div align="center">
        <h1><u>Order Booking Page</u></h1>
        <form action="/bookOrder" method="post">
            <h3>
                Customer ID:<input type="text" name="customerId" required>
                <br/><br/>
                Restaurant ID:<input type="text" name="restaurantId" required>
                <br/><br/>
                Item Name:<input type="text" name="itemName" required>
                <br/><br/>
                Quantity:<input type="text" name="quantity" required>
                <br/><br/>
                Amount:<input type="text" name="amount" required>
                <br/><br/>
                Order Date:<input type="text" name="orderDate" required>
                <br/><br/>
                Order Status:<input type="text" name="orderStatus" required>
                <br/><br/>
                Payment Status:<input type="text" name="paymentStatus" required>
                <br/><br/>
                <button type="submit">Book Order</button>
            </h3>
        </form>
    </div>
</body>
</html>