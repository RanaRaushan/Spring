<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.learning.webmvc.utils.*" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
    <div align="center">
        <form:form method="POST" modelAttribute="${AttributeName.USER}">
            <table>
            <caption><h2>Registration</h2></caption>
                <tr>
                    <td><label>User ID</label></td>
                    <td><form:input path="userID"/></td>
                </tr>
                <tr>
                    <td><label>User Name</label></td>
                    <td><form:input path="userName"/></td>
                </tr>
                <tr>
                    <td><label>Password</label></td>
                    <td><form:input type="password" path="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
            <h2>${error} </h2>
        </form:form>
    </div>
</body>
</html>