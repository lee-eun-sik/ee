<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
<form method="get" action="/login" id="login">
	아이디 : <input type="text" name="id" id="id" placeholder="abcdef"> <br>
	비밀번호 : <input type="text" name="pwd" id="pwd" placeholder="12345678"><br>
	<button type="submit" name="login">로그인</button>
</form>
<a href="/user/join">
<script type="text/javascript">
	$(document).ready(function() {
		//로그인 폼에 섬밋이벤트시 작동
		$("#login").submit(function(event) {
			event.preventDefault(); //기본 폼 제출 방지
			
			$.ajax({
				url: '/login_authenticaition', // 로그인 요청 URL
				type: 'GET',
				data : $(this).serialize(), // 폼 데이터 직렬화
				dataType: 'json',
				success: function(response) {
					//응답 처리
					System.out.print(response);
					if (response.success) {
						alert("로그인에 성공하셨습니다.");
						window.location.href = '/main.jsp'//로그인 성공 후 메인페이지로 갑니다.
					} else {
						alert("로그아웃에 실패하셨습니다."); // 로그인 인증이 안됬으면 실패
						window.location.href = '/login.jsp'
					}
				},
				error: function() {
					alert("통신 실패");
				}
			});
		});
	});
</script>
</body>
</html>