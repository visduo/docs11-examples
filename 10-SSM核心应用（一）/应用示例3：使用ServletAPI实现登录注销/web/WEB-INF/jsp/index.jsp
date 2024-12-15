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
<header>
    <nav>
        <h1>724便利店管理系统</h1>
        <div>
            <a href="/index">首页</a>
            <!-- 退出登录，跳转到/logout -->
            <a href="/logout">退出系统</a>
        </div>
    </nav>
    <div class="time">
        <span id="time"></span>
        <span>为了保证正常使用，请使用IE10.0以上版本！</span>
    </div>
</header>
<div class="main">
    <aside>
        <div>
            <h1>菜单</h1>
        </div>
        <ul>
            <li><a href="#">入库记录管理</a></li>
            <li><a href="#">供货商管理</a></li>
            <li><a href="/sysUser/list.html">用户管理</a></li>
            <li><a href="#">角色管理</a></li>
            <li><a href="#">修改密码</a></li>
            <li><a href="/logout">退出系统</a></li>
        </ul>
    </aside>
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
<footer>© 版权所有</footer>
<script src="/assets/js/time.js"></script>
</body>
</html>
