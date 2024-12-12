<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>724便利店管理系统</title>
    <link rel="stylesheet" href="/assets/css/style.css">
    <link rel="stylesheet" href="/assets/css/login.css">
</head>
<body>
<div class="container">
    <h1>724便利店管理系统</h1>
    <section>
        <form action="index.html">
            <div>
                <label for="account">账号：</label>
                <input type="text" id="account" name="account" placeholder="请输入账号">
            </div>
            <div>
                <label for="password">密码：</label>
                <input type="password" id="password" name="password" placeholder="请输入密码">
            </div>
            <div>
                <button type="submit"><span>登录</span></button>
                <button type="reset"><span>重置</span></button>
            </div>
        </form>
    </section>
</div>
</body>
</html>
