<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>login1.html</title>
    <script src="../script/jquery-3.6.1.min.js"></script>
    <link rel="stylesheet" href="resources/css/login.css">
</head>
<body>
    <section class="logni-form">
        <h1>Login</h1>
        <form action="">
            <div class="int-area">
                <input type="text" name="id" id="id" autocomplete="off" required>
                <label for="id">USER NAME</label>
            </div>
            <div class="int-area">
                <input type="password" name="pw" id="pw" autocomplete="off" required>
                <label for="pw">PASSWORD</label>
            </div>
            <div class="btn-area">
                <button id="btn" type="submit">LOGIN</button>
                
            </div>
        </form>
        <div class="caption">
            <a href="">Forgot Password</a>
            <a href="">회원가입</a>
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