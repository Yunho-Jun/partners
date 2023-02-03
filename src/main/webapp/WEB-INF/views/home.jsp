<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
String path=request.getContextPath();
System.out.print("path : "+path);

%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
function redeptlist() {
	//alert("sign!!!!");
	var htmltxt="";
	$.ajax({
		type:"post",
		url:"<%=path%>/test/member5",
		success:function(result){
			htmltxt="<table border='1'>";
			
			for ( var ele in result) {
				//console.log(result[ele].loc);
				htmltxt=htmltxt+"<tr><td>no:"+result[ele].id+
				"</td><td>name:"+result[ele].name+"</td></tr>";
			}
			htmltxt=htmltxt+"</table>";
			$("#display").html(htmltxt);
		}
	});	
}
</script>

<a href="login">로그인</a>
<a href="join">회원가입</a>

<hr />

<h3>db접속 데이터 조회 by RestController</h3>
<hr />
<a href="javascript:redeptlist();">restdeptlist</a> <br />
<hr />
<div id="display">이곳이 데이터 추가되는 곳</div>


<hr />
<P>  The time on the server is ${serverTime}. </P>
<a href="list">listttttttt go</a>
<a href="admin">admin list</a>
<a href="chat">chat</a>
</body>



</html>
