<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		.form {background-color: cyan;} 
		input {background: yellow;}
		
	</style>
</head>
<body>
	<h3>hello jsp</h3>
	<form method="get" action="/Ex.do" class="form">
		num1 = <input type="text" name="num1" id="num"><br>
		num2 = <input type="text" name="num2" id="num1"><br>
		
		hangle1 = <input type="text" name="hangle"><br>
		<button type="submit">버튼</button>
	</form>
	
</body>

</html>