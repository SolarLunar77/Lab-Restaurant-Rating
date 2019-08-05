<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<p>Welcome!</p>

<c:forEach var="restaurants" items="${restaurants}">
		<p>${restaurants.name} ${restaurants.rating}</p>
</c:forEach>


</body>
</html>