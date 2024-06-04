<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원상세정보</h1>
	
	<table boarder="1">
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th>NAME</th>
			<th>ROLE</th>
		</tr>
		<tr>
			<td>${member.id }</td>
			<td>${member.password }</td>
			<td>${member.name }</td>
			<td>${member.role }</td>
		</tr>
	</table>
	
	
	<a href="edit.do?id=${member.id }">회원정보수정</a>
	<a href="delete.do?id=${member.id }">회원삭제</a>
</body>
</html>