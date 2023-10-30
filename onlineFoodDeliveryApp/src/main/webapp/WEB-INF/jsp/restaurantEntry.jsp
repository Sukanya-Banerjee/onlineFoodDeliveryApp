<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>New Restaurant Entry</title>
</head>
<body>
<div align="center">
    <h1><u>New Restaurant Entry Page</u></h1>
    <form:form action="/restaurant" method="post" modelAttribute="restaurantRecord">
        <h3>
            New Restaurant ID:<form:input type="text" path="restaurantId" readOnly="true"/>
            <br/><br/>

            New Restaurant Name:<form:input type="text" path="restaurantName"/>
            <br/><br/>

            New Restaurant Type:<form:input type="text" path="type"/>
            <br/><br/>
            <button type="submit">Submit</button>
        </h3>
    </form:form>
</div>
</body>
</html>