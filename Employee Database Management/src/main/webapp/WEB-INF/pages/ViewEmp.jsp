<!-- EL IMPLICIT OBJECT::pageContext.request.contextPath
(http://localhost:8080/SpringHibIntegra)-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<head>
<link href="<c:url value="/resources/css/delete.css" />" rel="stylesheet">
</head>

  <body>
  <h1><font  color="white"><center>Employees List</center></font></h1>  
<table border="3" width="100%" style="text-align:center;" style="border-color: white">  

<tr><th><font  color="white">Id</font></th><th><font  color="white">name</font></th><th><font  color="white">username</font></th><th><font  color="white">password</font></th><th><font  color="white">Email</font></th><th><font  color="white">Age</font></th><th><font  color="white">Delete::</font></th></tr>
  <!-- emps === model attribute in controller -->
   <c:forEach var="emp11" items="${emps}">   
   <tr>  
   <td><font  color="white">${emp11.id}</font></td>  
   <td><font  color="white">${emp11.name}</font></td> 
   <td><font  color="white">${emp11.username}</font></td>  
   <td><font  color="white">${emp11.password}</font></td>   
   <td><font  color="white">${emp11.email}</font></td>      
   <td><font  color="white">${emp11.age}</font></td>      
        <td>
        <!-- 1.onclick javascript event 2.confirm similar to alert but takes OK CANCEL BUTTONS -->
       <a href="deleteemps/${emp11.id}" onclick="if(!(confirm('Are you sure you want to delete this employee?'))) return false"><font  color="white">DeleteRecord</font></a></td>      
  
   </tr>  
   </c:forEach>  
   </table>