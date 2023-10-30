<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bill Paid</title>
</head>
<body>
    <div align="center">
        <h1><u>Bill Paid Page</u></h1>
        <form action="/payBill" method="post">
            <h3>
                Order Number:<input type="text" name="orderNo" required>
                <br/><br/>
                Amount Paid:<input type="text" name="amountPaid" required>
                <br/><br/>
                <button type="submit">Pay Bill</button>
            </h3>
        </form>
    </div>
</body>
</html>