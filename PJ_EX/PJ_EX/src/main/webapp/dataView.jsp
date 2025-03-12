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
int num1 = 0;
int num2 = 0;
String str1 = "";
String str2 = "";
try {
	num1 = Integer.parseInt(request.getParameter("num1"));
	num2 = Integer.parseInt(request.getParameter("num2"));
	str1 = request.getParameter("str1");
	str2 = request.getParameter("str2");
} catch (Exception e) {
	System.out.println("입력 정보가 올바르지 않습니다.");
}
	for(var i=0; i<10; i++) {
		
	
%>
1num1  : <%=num1 %><br/>
1num2  : <%=num2 %><br/>
1str1  : <%=str1 %><br/>
1str2  : <%=str2 %> <br/>
<br/>
<%
	}
%>
</body>
</html>