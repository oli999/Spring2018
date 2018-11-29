<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
<h3>인덱스 페이지 입니다.</h3>
<ul>
	<li><a href="json01.do">json 응답1</a></li>
	<li><a href="json02.do">json 응답2</a></li>
	<li><a href="json03.do">json 응답3</a></li>
	<li><a href="json04.do">json 응답4</a></li>
	<li><a href="json05.do">json 응답5</a></li>
	<li><a href="json06.do">json 응답6</a></li>
	<li><a href="json07.do">json 응답7</a></li>
	<li><a href="json08.do">json 응답8</a></li>
	<li><a href="xml01.do">xml 응답1</a></li>
	<li><a href="xml02.do">xml 응답2</a></li>
	<li><a href="xml03.do">xml 응답3</a></li>
	<li><a href="xml04.do">xml 응답4</a></li>
	<li><a href="users/signup_form.do">회원가입 폼 예제</a></li>
	<li><a href="download.do?num=999">파일 다운로드(AbstractView 테스트)</a></li>
</ul>
<h3>친구 목록입니다.</h3>
<ul id="friendList">
	
</ul>
<button id="getBtn">목록받아오기</button>
<h4>공지사항</h4>
<ul>
	<c:forEach var="tmp" items="${noticeList }">
		<li>${tmp }</li>
	</c:forEach>
</ul>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script>
	$("#getBtn").click(function(){
		$.ajax({
			url:"json04.do",
			method:"get",
			success:function(responseData){
				console.log(responseData);
				//responseData 는 배열이다.
				$("#friendList li").remove(); // 모든 li 요소를 일단 지우고
				//반복문 돌면서 li 요소를 만들어서 추가 한다. 
				for(var i=0; i<responseData.length; i++){
					var tmp=responseData[i];
					$("<li/>").text(tmp).appendTo("#friendList");
				}
			}
		});
	});
</script>
</body>
</html>










