<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <!-- 如果有错误提示，则展示错误提示 -->
        <c:if test="${message != null && message != ''}">
            <p style="color: red; font-weight: bold">${message}</p>
        </c:if>
        <!-- 表单POST请求/login -->
        <form action="/login" method="post">
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
