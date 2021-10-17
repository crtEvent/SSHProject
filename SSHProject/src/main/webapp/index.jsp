<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>Hello World SSHProject</p>
	<div>
		<p><a href="<c:url value='/sample/testLogger.do'/>">/sample/testLogger.do</p>
		<p><a href="<c:url value='/sample/testDB.do'/>">/sample/testDB.do</p>
		<p><a href="<c:url value='/sample/testMyBatis.do'/>">/sample/testMyBatis.do</p>
		<p><a href="<c:url value='/main/main.do'/>">/main/main.do</p>
	</div>
	
</body>
</html>