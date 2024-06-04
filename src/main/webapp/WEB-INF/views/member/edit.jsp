<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보수정</h1>
	
	<form method="post">
		<table boarder="1">
			<tr>
				<th>ID</th>
				<th>PW</th>
				<th>NAME</th>
				<th>ROLE</th>
			</tr>
			<tr>
				<td>${member.id }</td>
				<td><input name="password" value="${member.password }"></td>
				<td><input name="name" value="${member.name }"></td>
				<td><input name="role" value="${member.role }"></td>
			</tr>
		</table>
		<button type="submit">수정</button>
	</form>
	<a href="list.do">뒤로</a>
</body>
</html>