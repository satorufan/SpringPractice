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
	<h1>회원 리스트</h1>
	<table border="1">
		<tr>
			<th>ID</th><th>PW</th><th>NAME</th><th>ROLE</th>
		</tr>
	<c:forEach var="member" items="${memberList }">
		<tr>
			<td><a href="detail.do?id=${member.id}">${member.id }</a></td>
			<td>${member.password }</td>
			<td>${member.name }</td>
			<td>${member.role }</td>
		</tr>
	</c:forEach>
	</table>
	
	<a href="input.do">회원정보입력</a>
</body>
</html>