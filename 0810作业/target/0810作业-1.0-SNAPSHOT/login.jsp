<%--
  Created by IntelliJ IDEA.
  User: qwerty
  Date: 2023/8/10
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <style>
        body {
            background-color: #f5f5f5;
        }

        .mask {
            width: 1200px;
            margin: 0 auto;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .holder {
            width: 200px;
            margin: 20px auto;
            height: 271px;
            background: #ffffff;
            padding: 24px;
            border-radius: 8px;
            box-shadow: 0 0 10px #b8b8b8;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 22px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 8px;
            background-color: #2b59ff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<div class="mask">
    <div class="holder">
        <form action="doLogin" method="post">
            <p>输入登录的账户:</p>
            <input type="text" name="customerName" placeholder="账户的用户名">
            <p>输入密码:</p>
            <input type="password" name="customerPassword" placeholder="用户的密码">
            <input type="submit" value="登录">
        </form>
    </div>
</div>
</body>
</html>