<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/radio">
		<input type="text" name="num1"><br>
		<input type="text" name="num2"><br>
		
		사람1<input type="radio" name="radio1" value="1"> <br>
		사람2<input type="radio" name="radio1" value="2"> <br>
		사람3<input type="radio" name="radio1" value="3"> <br>
		
		고양이1<input type="checkbox" name="checkbox1" value="cat1"> <br>
		고양이2<input type="checkbox" name="checkbox1" value="cat2"> <br>
		고양이3<input type="checkbox" name="checkbox1" value="cat3"> <br>
		고양이4<input type="checkbox" name="checkbox1" value="cat4"> <br>
		
		<span style="float: left;margin-right: 20px">
		<select id="job" name="job" size="1">
			<option value="">선택하세요</option>
			<option value="학생">학생</option>
			<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
			<option value="언론">언론</option>
			<option value="공무원">공무원</option>
			<option value="군인">군인</option>
			<option value="서비스업">서비스업</option>
			<option value="교육">교육</option>
		</select>
		</span>
		
		<label for="interest" style="float: left;">관심분야</label>
		<select id="interest" name="interest" size='5' multiple="multiple">
			<option value="에스프레소">에스프레소</option>
			<option value="로스팅"> 로스팅</option>
			<option value="생두">생두</option>
			<option value="원두">원두</option>
			<option value="핸드드립">핸드드립</option>
		</select>
		<br><br>
		<button type="submit" style="float: right; margin-right:"50px">결과</button>
	</form>
</body>
</html>