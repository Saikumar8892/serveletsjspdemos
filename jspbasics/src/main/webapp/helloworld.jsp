<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Hello World</h1>
    
    The time on the server is <%=new java.util.Date() %>
    
    <br/>
    Converting a string to UpperCase: <%= new String("Hello world").toUpperCase()  %>
</body>
</html>