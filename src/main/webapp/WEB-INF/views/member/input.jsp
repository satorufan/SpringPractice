<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>멤버 추가</h1>
	<form method="POST" action="input.do">
		<table border="1">
			<tr>
				<th>ID</th><th>PW</th><th>NAME</th><th>ROLE</th>
			</tr>
			<tr>
				<td><input name="id" /></td>
				<td><input name="password"/></td>
				<td><input name="name"/></td>
				<td><input name="role"/></td>
			</tr>
		</table>
		<button type="submit">추가</button>
	</form>
	<a href="list.do">목록으로</a>
</body>
</html>