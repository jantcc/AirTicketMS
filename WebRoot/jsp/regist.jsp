<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">

    <head>
        <meta charset="utf-8">
        <title>注册</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" href="../css/supersized.css">
        <link rel="stylesheet" href="../css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>
         <div class="page-container">
            <h1>注册</h1>
            <form action="RegistServer" method="post">
                <input type="text" name="user.username" placeholder="用户名">
                <input type="password" name="user.password" placeholder="密码">             
                <table>
                <tr>
                <td><input type="text"  placeholder="性别" readonly="true" style="width: 40px;margin-left: 2px"></td>
                <td><input  type="radio" checked="checked" name="user.sex" style="width: 40px;height: 20px;margin-left: 5px" value="男"></input>男</td>
                <td><input  type="radio"  name="user.sex" style="width: 40px;height: 20px;margin-left: 5px" value="女"></input>女</td>
                </tr>
                </table>         
                <input type="text" name="user.realname" placeholder="真实姓名">
                <input type="text" name="user.idcard" placeholder="身份证号">
                <input type="text" name="user.phone" placeholder="电话">
                <input type="text" name="user.email" placeholder="邮件">
                <button type="submit">提交</button>
                <div class="error"><span>+</span></div>
            </form>
        <!-- Javascript -->
        <script src="../js/jquery-1.8.2.min.js"></script>
        <script src="../js/supersized.3.2.7.min.js"></script>
        <script src="../js/regist.js"></script>
        <script src="../js/scripts.js"></script>

    </body>

</html>