<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.learning.webmvc.utils.*" %>

<html>
<head>
    <title>View Items</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>View Todo Items</h2></caption>
                <tr>
                    <td><label>Id</label></td>
                    <td><c:out value="${todoItem.id}"/></td>
                </tr>
                <tr>
                    <td><label>Title</label></td>
                    <td><c:out value="${todoItem.title}"/></td>
                </tr>
                <tr>
                    <td><label>Details</label></td>
                    <td><c:out value="${todoItem.details}"/></td>
                </tr>
                <tr>
                    <td><label>DeadLine</label></td>
                    <td><c:out value="${todoItem.deadLine}"/></td>
                </tr>
        </table>
        <c:url var="backUrl" value="${Mappings.ITEMS}"/>
        <h2><a href="${backUrl}">Show Table</a></h2>
    </div>
</body>
</html>