<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <style type="text/css">
        .row {
            clear:left;
            padding: 5px;
        }
        .label {
            float:left;
            width:100px;
        }
        .input {
            float:left;
        }
        .error {
            color: red;
        }
    </style>
</head>
<body>
<%
if (request.getParameter("error") != null) {
%>
<div class="row">
    <div class="error">
        Неправильно введено имя пользователя или пароль
    </div>
</div>
<%
}
%>
    <form name="login_form" action="/login" method="post">
        <div class="row">
            <div class="label">
                <label for="username">Логин</label>
            </div>
            <div class="input">
                <input type="text" id="username" name="username"/>
            </div>
        </div>
        <div class="row">
            <div class="label">
                <label for="password">Пароль</label>
            </div>
            <div class="input">
                <input type="password" id="password" name="password"/>
            </div>
        </div>
        <div class="row">
        <button type="submit" class="btn">Войти</button>
        </div>
    </form>
</body>
</html>