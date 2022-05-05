<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.learning.webmvc.utils.*" %>

<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
        <form:form method="POST" modelAttribute="${AttributeName.TODO_ITEM}">
            <table>
            <caption><h2>${type} Todo Items</h2></caption>
                <tr>
                    <td><label>ID</label></td>
                    <td>
                        <form:input path="id" disabled="true" />
                    </td>
                </tr>
                <tr>
                    <td><label>Title</label></td>
                    <td><form:input path="title"/></td>
                </tr>
                <tr>
                    <td><label>Deadline</label></td>
                    <td><form:input path="deadLine"/></td>
                </tr>
                <tr>
                    <td><label>Details</label></td>
                    <td><form:textarea path="details"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        <c:url var="backUrl" value="${Mappings.ITEMS}"/>
        <h2><a href="${backUrl}">Back</a></h2>
    </div>
</body>
</html>