<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>

	<form action="join.jsp">
		아이디 : <input type="text" name="memid" /> <input type="button"
			value="중복확인" /> <br /> 
		비밀번호 : <input type="text" name="mempass" />
		<br /> 
		비밀번호 확인 : <input type="text" name="mempass" /> <br /> 이름 : <input
			type="text" name="memname" /> <br /> 성별 : <select name="memsex"
			id="memsex">

			<input type="radio" name="man" value="0"  />남성
			<input type="radio" name="woman" value="1" />여성

			
			<br />
		</select> <br /> 
		<input type="text" name="membirth" placeholder= "주민등록번호 앞 6글자"size="18" /> -ㅇㅇㅇㅇㅇㅇㅇ<br /> 
		이메일 : <input type="email" name="email" />	<br /> 
		핸드폰 번호 : <input type="tel" name="cphone" /> 예) 010-1111-2222 <br /> 
		<br /> 
	
			<input type="submit" value="확인" />
	</form>



</body>
</html>