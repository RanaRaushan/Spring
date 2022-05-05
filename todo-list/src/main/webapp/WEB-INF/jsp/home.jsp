<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.learning.webmvc.utils.*" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show Todo Items </a></h2>
        <h2>Welcome, ${userName}</h2>
    </div>
</body>
</html>