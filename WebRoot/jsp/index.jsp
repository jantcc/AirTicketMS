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
        <meta charset="utf-8">
        <title>登录</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/supersized.css">
        <link rel="stylesheet" href="css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
<script type="text/javascript"> 
var msg="${actionMessages[0]}";
if(msg!=""){
alert(msg);
}
</script>
    </head>

    <body>

        <div class="page-container">
            <h1>登录</h1>
            <form action="LoginServer" method="post">
                <input type="text" name="username"  placeholder="用户名">
                <input type="password" name="password"  placeholder="密码">
                <button type="submit">提交</button>
            </form>
            <div class="connect">

                <p>
                 <button type="button" onclick="window.location.href='jsp/regist.jsp'")">注册</button>
                </p>
            </div>
        </div>
		
        <!-- Javascript -->
        <script src="js/jquery-1.8.2.min.js"></script>
        <script src="js/supersized.3.2.7.min.js"></script>
        <script src="js/supersized-init.js"></script>
        <script src="js/scripts.js"></script>

    </body>

</html>


