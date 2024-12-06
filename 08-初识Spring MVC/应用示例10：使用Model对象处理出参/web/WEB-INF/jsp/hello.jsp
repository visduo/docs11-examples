<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello！</h1>
<!-- 使用JSP-EL表达式获取模型视图对象中的数据 -->
<h1>您的姓名：${userObject.name}</h1>
<h1>您的年龄：${userObject.age}</h1>
<h1>您的网址：${userObject.website}</h1>
</body>
</html>
