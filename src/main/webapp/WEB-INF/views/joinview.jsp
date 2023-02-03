<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script  > 
</script>

<body>
	<h3>가입하기</h3>

	<form action="joinProc.jsp">
		아이디 : <input type="text" id="memid" name="memid" /> 	<input type="button" value="중복확인" /> <br /> 

		비밀번호 : <input type="text" id="mempass" name="mempass" />	<br /> 
	
		비밀번호 확인 : <input type="text" id="mempass" name="mempass" /> <br /> 
		이름 : <input type="text" name="memname" /> <br /> 
		성별 : <select name="memsex" id="memsex">
				<input type="radio" name="man" value="0"  />남성
				<input type="radio" name="woman" value="1" />여성
		      </select> 
		      <br />
		
		<input type="text" name="membirth" placeholder= "주민등록번호 앞 6글자"size="18" /> -ㅇㅇㅇㅇㅇㅇㅇ<br /> 
		이메일 : <input type="email" name="email" />	<br /> 
		핸드폰 번호 : <input type="tel" name="cphone" /> 예) 010-1111-2222 <br /> 
		<br /> 
			<p>활동지역 :</p>  
		<input type="checkbox" name="memaddress" value="가산"  />가산
		<input type="checkbox" name="memaddress" value="구로"  />구로
		<input type="checkbox" name="memaddress" value="강남"  />강남
		<input type="checkbox" name="memaddress" value="여의도"  />여의도
		<input type="checkbox" name="memaddress" value="판교"  />판교
		
		<br />
	
			<input type="submit" value="확인" />
	</form>



</body>
</html>