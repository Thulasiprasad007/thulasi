<!-- EL IMPLICIT OBJECT::pageContext.request.contextPath
(http://localhost:8080/SpringHibIntegra)-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<head>
<link href="<c:url value="/resources/css/sample.css" />" rel="stylesheet">
<style>
.b1{
border-radius: 15px 50px 30px;
    border: 2px solid #609;
    padding: 20px; 
    width: 200px;
    height: 15px; 

}
</style>
</head>

<body>
<div>

	<form:form id="form1" name="form1" modelAttribute="admin" method="post" action="login">
		<table width="526" border="0" align="center">
			<tr>
				<td width="520">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			</tr>
			<tr >
			<div style="padding-top: 50px">
				<td style="padding-left: 200px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fieldset >
					<font size="15"><legend>&nbsp;&nbsp;Admin Login</legend></font>
						<table width="360" border="0" align="center">
							<tr>
								<td colspan="5">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							<td colspan="3" style="color: red"><c:if
									test="${not empty result}">${result}</c:if></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td width="50">&nbsp;</td>
							<td width="114"><font size="5">Username</font></td>
								<td colspan="2"><label> 
<form:input type="text" placeholder="Username" class="b1" name="txt_username" id="txt_username" style=" width : 159px;" path="Ausername" />
								</label></td>
								<td width="131">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><font size="5">Password</font></td>
								<td colspan="2"><label> 
<form:input type="password" placeholder="Password" class="b1" name="txt_password" id="txt_password" style=" width : 160px;" path="Apassword" />
								</label></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="109"><label></label></td>
								<td width="73"><label> <input type="submit" name="btn_login" id="btn_login" value="Login" />
								</label></td>
								<!--<td><a href="${pageContext.request.contextPath}/callproj">Register Here >>></a></td>-->
							</tr>
						</table>
					</fieldset></td></div>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>
