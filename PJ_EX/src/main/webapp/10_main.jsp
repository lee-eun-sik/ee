<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("userName")== null) {
	response.sendRedirect("login.jsp");	
} else {
	
%>

	<%=session.getAttribute("userName")%>님 안녕하세요!<br>
	저희 홈페이지에 방문해 주셔서 감사합니다.<br>
	즐거운 시간 되세요....<br>
	<form method="post" action="/logout.do">
		<input type="hidden" name="id" value="<%=session.getAttribute("userId")%>">
		<input type="submit" value="로그아웃">
	</form>
<%
}
%>	
</body>
</html>