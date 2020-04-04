<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <%@ page isELIgnored="false"%>
 <head>
<link href="<c:url value="/resources/css/view.css" />" rel="stylesheet">
</head>
  <body bgcolor="#FFC300 ">
  <h1><font  color="white"><center>Employees List</center></font></h1>  
<table border="3" width="100%" style="text-align:center;" style="border-color: white">  

<tr><th><font  color="white">Id</font></th><th><font  color="white">name</font></th><th><font  color="white">Username</font></th><th><font  color="white">Password</font></th><th><font  color="white">Email</font></th><th><font  color="white">Age</font></th></tr>  
  <!-- emps === model attribute in controller -->
   <c:forEach var="emp11" items="${emps}">   
   <tr>  
   <td><font  color="white">${emp11.id}</font></td>  
   <td><font  color="white">${emp11.name}</font></td> 
   <td><font  color="white">${emp11.username}</font></td> 
   <td><font  color="white">${emp11.password}</font></td> 
   <td><font  color="white">${emp11.email}</font></td>      
   <td><font  color="white">${emp11.age}</font></td>          
   
   </tr>  
   </c:forEach>  
   </table>