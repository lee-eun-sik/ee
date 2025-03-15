<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="hd.jsp" %>
	<%
		Calendar c = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		String username = "";
		Cookie[] cookies = request.getCookies();
		//쿠키가 있을 경우
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("username")) {
					username = cookie.getValue();
					System.out.println("Username: "+username);
				}
			}
		}
		request.setAttribute("username", username);
		String radio1 = request.getParameter("radio1");
		String[] job = request.getParameterValues("job");
		String[] interests = request.getParameterValues("interest");
		
		String[] checkbox1 = request.getParameterValues("checkbox1");
			for(int i = 0; i <checkbox1.length; i++) {		
	%>
	
	고양이 <%=(i+1) %> : <%=checkbox1[i] %> <br/>
	
	<%
			}
	%>
	선택한 사람<%=radio1%> <br>
	오늘 날짜: <%= today.format(c.getTime()) %> <br>
	지금 시간: <%= time.format(c.getTime()) %> <br>
	<%
		for(int j = 0; j <interests.length; j++) {
	%>
	
	
	관심분야 <%=interests[j] %> <br/>
	<%
		}
	%>
	
	<%
		for(int k = 0; k<job.length;k++) {	
	%>
	
	직업 <%=(k+1)%>: <%=job[k] %> <br>
	<%
		}
	%>
</body>
</html>