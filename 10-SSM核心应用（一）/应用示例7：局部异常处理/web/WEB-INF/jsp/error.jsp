<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>724便利店管理系统</title>
    <link rel="stylesheet" href="/assets/css/style.css">
    <link rel="stylesheet" href="/assets/css/error.css">
</head>
<body>
<div class="container">
    <h1>系统发生异常：${message}</h1>
    <h1 id="interval">5秒后返回上一页</h1>
    <script>
        let count = 5;
        let timer = setInterval(function () {
            count--;
            if (count <= 0) {
                clearInterval(timer);
            }
            document.getElementById("interval").innerText = count + "秒后返回上一页";
        }, 1000);
    </script>
</div>
</body>
</html>
