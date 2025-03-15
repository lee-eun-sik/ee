<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
<c:choose>
	<c:when test="${sessionScope.userName = null}">
		<c:redirect url="/example/login.jsp"/>
	</c:when>
	<c:otherwise>
		${sessionScope.userName}님 안녕하세요.
		<form method="post" id="logoutForm">
			<input type=hidden" name="id" value="${sessionScope.userId}">
			<button type="submit">로그아웃</button>
		</form>
		

	<%=session.getAttribute("userName")%>님 안녕하세요.
	<form method="post" id="logoutForm">
		<input type="hidden" name="id" value="<%=session.getAttribute("userId")%>" >
		<button type="submit">로그아웃</button>
	</form>
	<script>
        $(document).ready(function() {
        	//로그아웃 폼에 섬밋이벤트시 작동
            $("#logoutForm").submit(function(event) {
                event.preventDefault(); // 기본 폼 제출 방지

                $.ajax({
                    url: '/logout.do', // 로그인 요청 URL
                    type: 'POST',
                    data: $(this).serialize(), // 폼 데이터 직렬화
                    dataType: 'json',
                    success: function(response) {
                        // 응답 처리
                        if (response.success) {
                            alert("로그아웃에 성공하셨습니다.");
                            window.location.href = '/user/login.jsp'; // 로그인 성공 후 메인 페이지로 이동
                        } else {
                        	alert("로그아웃에 실패하셨습니다.");
                        }
                    },
                    error: function() {
                    	alert("통신 실패");
                
                    }
                });
            });
        });
    </script>
</c:otherwise>
</c:choose>



</body>
</html>