<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>724便利店管理系统</title>
    <link rel="stylesheet" href="/assets/css/style.css">
    <link rel="stylesheet" href="/assets/css/public.css">
    <link rel="stylesheet" href="/assets/css/index.css">
</head>
<body>
<%@include file="/WEB-INF/jsp/layouts/header.jsp"%>
<div class="main">
    <%@include file="/WEB-INF/jsp/layouts/aside.jsp"%>
    <div class="body">
        <div class="inner">
            <img src="/assets/images/clock.jpg" alt="">
            <!-- 从会话中读取当前登录的用户信息 -->
            <h1>${sessionScope.sysUser.realName} - ${sessionScope.sysUser.sysRole.roleName}</h1>
            <br>
            <p>欢迎使用724便利店管理系统!</p>
        </div>
    </div>
</div>
<%@include file="/WEB-INF/jsp/layouts/footer.jsp"%>
</body>
</html>
