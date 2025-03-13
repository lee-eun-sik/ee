<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<%
	if(session.getAttribute("userName") == null) {
		response.sendRedirect("login.jsp");
	} else {

%>
	<%=session.getAttribute("userName")%>님 안녕하세요.
	<form method="post" action="/logout.do">
		<input type="hidden" name="id" value="<%=session.getAttribute("userId")%>" >
		<button type="submit">로그아웃</button>
	</form>
<%
	}
%>
</body>
</html>