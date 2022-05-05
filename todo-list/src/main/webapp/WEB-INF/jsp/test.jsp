<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Todo List</title>
</head>
<body>

<div align="center">
<form:form modelAttribute="todo">
	<caption><h2>Todo Items</h2></caption>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Details</th>
			<th>Target Date</th>
			<th>Is it Done?</th>
		</tr>
		<c:forEach var="todo" items="${todoData.items}">
			<tr>
				<td>${todo.id}</td>
				<td>${todo.title}</td>
				<td>${todo.details}</td>
				<td>${todo.deadLine}</td>
				<td>${todo.taskDone}</td>
				<td><a type="button" href="view-todo?id=${todo.id}">View</a></td>
				<td><a type="button" href="update-todo?id=${todo.id}">Update</a></td>
				<td><a type="button" href="delete-todo?id=${todo.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
</form:form>
	<a href="add-todo"><input type="submit" value="Add"/></a>
</div>
</body>
</html>