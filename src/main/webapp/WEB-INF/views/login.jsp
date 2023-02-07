<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>
<%@ page import = "java.sql.* " %>    
<%@ page import = "javax.sql.* " %>
<%@ page import = "javax.naming.* " %>     

 <!-- 테스트 로그인  -->

<!DOCTYPE html>
<html>
<head>
    <title>파트너스 로그인 페이지</title>
    <script src="../script/jquery-3.6.1.min.js"></script>
    <link rel="stylesheet" href="resources/css/login.css">
</head>
<body>
    <section class="login-form">
        <h1>Login</h1>
        <form action="loginCheck" method="post">
            <div class="int-area">
                <input type="text" name="memid" id="memid" autocomplete="off" required>
                <label for="memid">USER NAME</label>
            </div>
            <div class="int-area">
                <input type="password" name="mempass" id="mempass" autocomplete="off" required>
                <label for="mempass">PASSWORD</label>
            </div>
            <div class="btn-area">
                <button id="btn" type="submit">LOGIN</button>
                
            </div>
        </form>
        <div class="caption">
            <a href="">Forgot Password</a>
            <a href="joinform">회원가입</a>
        </div>
    </section>
    <script>
        let id=$('#id');
        let pw=$('#pw');
        let btn=$('#btn');
        $(btn).on('click', function() {
            if($(id).val() == "") {
                $(id).next('label').addClass('warning');
                setTimeout(function() {
                    $('label').removeClass('warning');
                }, 1500);
            }
            else if($(pw).val() == "") {
                $(pw).next('label').addClass('warning');
                setTimeout(function() {
                    $('label').removeClass('warning');
                }, 1500);
            }
        });
    </script>
    
</body>
</html>