<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
<h2>회원가입</h2>
<script>
		$(document).ready(function() {
			//로그인 폼에 섬밋이벤트시 작동
			$("joinForm").submit(function(event) {
				event.preventDefault(); //기본 폼 제출 방지
				
				$.ajax({
					url: '/join.do', //로그인 요청 URL
					type: 'POST',
					data: $(this).serialize(), //폼 데이터
					dataType: 'json',
					success: function(response) {
						//응답 처리
						if(response.success) {
							alert("회원가입 성공! 로그인 페이지로 이동합니다." + "로그인 페이지로 이동합니다.");
							window.location.href = '/example/login.jsp'; //로그인
						} else {
							alert("회원가입 실패하셨습니다.");
						}
					},
					error: function() {
						alert("통신 실패");
					}
				});
			});
			
		});
	</script>
<form>
	<label for="userId">아이디:</label>
	<input type="text" id="userId" name = "userId" maxlength="20" placeholder="아이디 입력" required>
	<br/>
	<label for="username">이름:</label>
	<input type="text" id="username" name="username" maxlength="50" placeholder="이름 입력" required>
	<br/>
	<label for="password">비밀번호:</label>
	<input type="password" id="password" name="password" maxlength="20" placeholder="비밀번호 입력" required>
	<br/>
	<label for="email">이메일:</label>
	<input type="email" id="email" name="email" maxlength="100" placeholder="이메일 입력" required/>
	<br/>
	<button type="submit" id="registerBtn">가입하기</button>
</form>
<a href="/example/login.jsp">로그인 페이지로 이동</a>
</body>
</html>