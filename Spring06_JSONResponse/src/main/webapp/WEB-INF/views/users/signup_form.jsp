<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/users/signup_form.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h3>회원 가입 폼 입니다.</h3>
	<form action="signup.do" method="post" id="signupForm">
		<label for="id">아이디</label>
		<input type="text" name="id" id="id"/>
		<button id="checkBtn">중복확인</button>
		<span id="checkResult"></span>
		<br/>
		<button type="submit">가입</button>
	</form>
</div>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script>
	//중복확인 버튼을 눌렀을때 실행할 함수 등록 
	$("#checkBtn").click(function(){
		//입력한 아이디를 읽어온다.
		var inputId=$("#id").val();
		//ajax 요청을 통해서 아이디를 서버에 보내고 응답 받는다.
		$.ajax({
			url:"checkid.do",
			method:"get",
			data:{inputId:inputId},
			success:function(responseData){
				
			}
		});
		return false; //폼 전송 막기 
	});
</script>
</body>
</html>




























