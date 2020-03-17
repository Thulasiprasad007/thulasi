<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>
<ul>
<c:forEach var="ListValue" items="${lists}">
<li>${ListValue}</li>
</c:forEach>
</ul>
</h1>