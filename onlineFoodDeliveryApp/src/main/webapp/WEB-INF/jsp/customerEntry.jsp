<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer Entry</title>
</head>
<body>
<div align="center">
<h1><u>New Customer Entry Page</u></h1>
<form:form action="/customer" method="post" modelAttribute="customerRecord">
<h3>
New Customer Id:<form:input type="text" path="customerId" readOnly="true"/>
<br/><br/>

New Customer Name:<form:input type="text" path="customerName"/>
<br/><br/>

New Customer Address:<form:input type="text" path="address"/>
<br/><br/>

New Customer Contact Number:<form:input type="text" path="contactNumber"/>
<br/><br/>

New Customer Email:<form:input type="text" path="email"/>
<br/><br/>

New Customer Status:<form:input type="text" path="status"/>
<br/><br/>
<button type="submit">Submit</button>
</h3>
</form:form>


</div>
</body>
</html>