<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page isELIgnored="false"%>
<h2>${msg}</h2>
<a id="en" href="/Maven/user_i18n?lang=en">English</a>
<a id="fr" href="/Maven/user_i18n?lang=fr">French</a>
<h1>
<!-- properties file keyname -->
<spring:message code="signmsg"/>
</h1>