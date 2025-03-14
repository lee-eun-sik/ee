<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원정보</h2>
	<form id="joinForm">
		<label for="userId">아이디:</label>
		${applicationScope["userInfo_"+ sessionScope.userId].userId}
		<br/>
		<label for="username">이름:</label>
		${applicationScope["userInfo_"+sessionScope.userId].username}
	</form>
</body>
</html>