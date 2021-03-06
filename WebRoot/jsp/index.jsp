<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html lang="zh-CN">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>AirTicketMS</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="iconfont/iconfont.css">
    <link rel="stylesheet" href="css/supersized.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/reset.css">
    <script type="text/javascript"> 
var msg="${actionMessages[0]}";
if(msg!=""){
alert(msg);
}
</script>
</head>
<body>

<div class="container">
    <div class="background">
        <div class="title">
            <h2>AirTicketMS</h2>
        </div>
        <img src="img/plant.png" alt="plant">

        <div class="loginPage">
            <ul>
                <li><i class="iconfont">&#xe608;</i></li>
                <li><i class="iconfont">&#xe608;</i></li>
                <li><i class="iconfont">&#xe608;</i></li>
            </ul>
        </div>
    </div>

    <div class="page-container" style="height: 600px;">
        <h1>登录</h1>
        <form action="LoginServer" style="margin: 0 auto" method="post">
            <input type="text" name="username"  placeholder="用户名">
            <input type="password" name="password"  placeholder="密码">
            <button type="submit">提交</button>
        </form>
        <div class="connect">

            <p>
                <button type="button" onclick="window.location.href='jsp/regist.jsp'">注册</button>
            </p>
        </div>
    </div>
</div>


    <!-- Javascript -->
    <script src="js/jquery-1.8.2.min.js"></script>
    <script src="js/supersized.3.2.7.min.js"></script>
    <script src="js/supersized-init.js"></script>
    <script src="js/scripts.js"></script>
    <script src="js/index.js"></script>
</body>
</html>