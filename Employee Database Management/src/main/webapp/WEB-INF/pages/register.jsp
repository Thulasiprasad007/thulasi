<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="<c:url value="/resources/css/rg.css" />" rel="stylesheet">
<style>

 .h1{
    border-radius: 15px 50px 30px;
    border: 2px solid #609;
    padding: 20px; 
    width: 200px;
    height: 15px; 
}
   </style> 
   </head>
   <script>
    function validateform()
    {  
var name=form1.txt_username.value;  
var password=form1.txt_password.value; 
var name1=form1.txt_name.value;
var age=form1.txt_age.value;
var email=form1.txt_email.value;
  
if (name==null || name=="")
{  
  alert("User Name can't be blank");  
  return false;  
}
else if(password.length<6)
{  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
else if(name1==null || name1=="")
	{
	alert("Name can't be blank");  
	  return false;  
	}
else if(age==null || age=="")
{
alert("Age Block cont be blank");  
  return false;  
}
else if(email==null || email=="")
{
alert("email Block cont be blank");  
  return false;  
}
}  
</script> 


<body >
<div>
 <!--<img height = 200 width=200 src="<c:url value="/resources/images/reg.jpg"></c:url>"/>-->

	<form:form id="form1" name="form1" modelAttribute="employee" method="post" action="register" onsubmit="return validateform()">
		<table width="200" border="0" align="center">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
			     <div style="padding-top:140px">
				<td><fieldset style="border:none">
						
						<table width="609" border="0" align="center">

							<tr>
								
								<td>&nbsp;</td>
								<td colspan="2"></td>
								<td colspan="3"><form:input type="text" name="txt_name" class="h1"
										id="txt_name" placeholder="Name" path="name" /></td>
								<td>&nbsp;</td>
								
							</tr>
							<tr>
								<td width="69">&nbsp;</td>
								<td colspan="2"></td>
								<td colspan="3"><label> <form:input type="text" class="h1"
											name="txt_username" id="txt_username" placeholder="Username" path="username" />
								</label></td>
								<td width="56">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2"></td>
								<td colspan="3"><form:input type="password" class="h1"
										name="txt_password" id="txt_password" placeholder="Password" path="password" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2"></td>
								<td colspan="3"><form:input type="email" name="txt_email" class="h1"
										id="txt_email" placeholder="Email" path="email" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2"></td>
								<td colspan="3"><form:input type="text" name="txt_age" class="h1"
										id="txt_age" placeholder="Age" path="age" /></td>
								<td>&nbsp;</td>
							</tr>
							</div>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="60">&nbsp;</td>
								<td width="68"><input type="submit" name="btn_submit"
									id="btn_submit" value="Submit" /></td>
								<td>&nbsp;</td>
							</tr>

						</table>

					</fieldset></td>
					</div>
			</tr>
		</table>

	</form:form>
</body>
</html>
