<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>userInfo</title>
    <link rel="stylesheet" href="../css/userInfo.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
    <link rel="stylesheet" href="../css/reset.css">
    <script type="text/javascript"> 
var msg="${actionMessages[0]}";
if(msg!=""){
alert(msg);
}
</script>
</head>
<body>
    <header>
        <div class="loginBox">
            <p>欢迎您,<s:property value="#session.user.username"/></p>
            <a href="#">进入后台</a>
        </div>
    </header>
    <div class="sub-header">
        <nav class="sub-header-content">
            <ul>
                <li class="nav-list"  onclick="window.location.href='userInfo.jsp'">
                    <i class="iconfont">&#xe60b;</i>
                </li>
                <li class="nav-list nav-active" onclick="window.location.href='userInfo.jsp'">
                    <span>我的信息</span>
                    <i class="iconfont">&#xe627;</i>
                </li>
                <li class="nav-list">
                    <span>预定行程</span>
                    <i class="iconfont">&#xe683;</i>
                </li>

            </ul>
        </nav>
    </div>

    <div class="content">
        <div class="user-form">
            <nav class="form-nav">
                <span>您的位置:首页 ></span>
                <span>我的东航</span>
            </nav>
            <aside>
                <ul>
                    <li class="form-nav-list"  onclick="window.location.href='userInfo.jsp'">
                        <i class="iconfont">&#xe60a;</i>
                        <span>个人信息</span>
                    </li>
                    <li class="form-nav-list">
                        <i class="iconfont">&#xe600;</i>
                        <span>机票订单</span>
                    </li>
                    <li class="form-nav-list"  onclick="window.location.href='updatePassword.jsp'">
                        <i class="iconfont">&#xe73f;</i>
                        <span>更改密码</span>
                    </li>
                </ul>
            </aside>
            <div class="form-content">
                <span>修改密码</span>
                <form method="post" action="UserUpdatePasswordServer">
                <div class="baseLine"></div>
             	<input type="submit" value="提交"/>

                <table style="width: 660px; margin: 0 auto; text-align: center; margin-bottom: 20px">
                   <tr>
                    <td>
                    	<input type="hidden" name="user.id" value="<s:property value="#session.user.id"/>"/>
                        <label>用户名:</label><input name="user.username"  type="text" style="background: none;border: none;" readonly="true" value="<s:property value="#session.user.username"/>">
                    </td>
                </tr>
                    <tr>
                         <td>
                            <label>原密码:</label><input name="user.password" type="password"/>
                        </td>     
                    </tr>
                        <tr>
                         <td>
                            <label>新密码:</label><input id="newpassword" name="newpassword" type="password"/>
                        </td>     
                    </tr>
                        <tr>
                         <td>
                            <label>确认密码:</label><input id="confirmpassword" onblur="check()" type="password"/> <span id="tishi"></span>
                        </td>     
                    </tr>
                </table>
			</form>
            </div>
        </div>
    </div>
     <script src="../js/checkpassword.js"></script>
</body>
</html>