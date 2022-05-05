<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.learning.webmvc.utils.*" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
    <div align="center">
    <c:url var="loginLink" value="${Mappings.LOGIN}"/>
    <h2><a href="${loginLink}">LOGIN</a></h2>
    <c:url var="registerLink" value="${Mappings.REGISTER}"/>
    <h2><a href="${registerLink}">REGISTER</a></h2>
    </div>
</body>
</html>