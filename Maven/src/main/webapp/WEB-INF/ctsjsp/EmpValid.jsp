
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
.myerror{color:red}
</style>
</head>
<body>
<form:form action="checkForm" modelAttribute="emp">
Eno: <form:input path="eno"/>
<form:errors path="eno" cssClass="myerror"/><br><br>
Name: <form:input path="name"/>
<form:errors path="name" cssClass="myerror"/><br><br>
Salary: <form:input path="salary"/>
<form:errors path="salary" cssClass="myerror"/><br><br>
Pincode: <form:input path="postal_code"/>
<form:errors path="postal_code" cssClass="myerror"/><br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>



