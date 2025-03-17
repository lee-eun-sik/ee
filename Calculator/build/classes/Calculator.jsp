<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/Calculator" class="form"> //통신 주소, 주소 날라감
	num1 = <input type="text" name="num1" id="num1"><br>
	num2 = <input type="text" name="num2" id="num2"><br>
	<button type="submit" name="result">결과</button>
</form>
</body>
</html>