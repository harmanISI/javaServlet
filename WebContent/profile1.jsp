<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>  hello </h1>
<br>
<a href="Logout">Logout</a>|

<tag:if test='${user != null}'>
		<h3 style="color:red;">${user}</h3>
		
		
	</tag:if>
</body>
</html>