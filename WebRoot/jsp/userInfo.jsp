<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>userInfo</title>
    <link rel="stylesheet" href="../css/userInfo.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
    <link rel="stylesheet" href="../css/reset.css">
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
            <li class="nav-list">
                <i class="iconfont">&#xe60b;</i>
            </li>
            <li class="nav-list nav-active">
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
                <li class="form-nav-list">
                    <i class="iconfont">&#xe60a;</i>
                    <span>个人信息</span>
                </li>
                <li class="form-nav-list">
                    <i class="iconfont">&#xe600;</i>
                    <span>机票订单</span>
                </li>
                <li class="form-nav-list">
                    <i class="iconfont">&#xe73f;</i>
                    <span>更改密码</span>
                </li>
            </ul>
        </aside>
        <div class="form-content render-form">
            <span>基本信息</span>
            <div class="baseLine"></div>
            <span class="edit render-form-flag">编辑</span>

            <table style="width: 660px; margin: 0 auto; text-align: center; margin-bottom: 20px">
                <tr>
                    <td>
                        <label>用户名:</label><span><s:property value="#session.user.username"/></span>
                    </td>
                    <td>
                        <label>积分:</label><span><s:property value="#session.user.points"/></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>性别:</label><span><s:property value="#session.user.sex"/></span>
                    </td>
                    <td>
                        <label>注册时间:</label><span><s:property value="#session.user.registetime"/></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>真实姓名:</label><span><s:property value="#session.user.realname"/></span>
                    </td>
                    <td>
                        <label>账户类型:</label><span><s:if test="#session.user.usertype=='0'">普通客户</s:if>
                            <s:elseif test="#session.user.usertype=='1'">银牌客户</s:elseif>
                            <s:else>金牌客户</s:else>
                            </span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>身份证号:</label><span><s:property value="#session.user.idcard"/></span>
                    </td>
                </tr>
            </table>


            <span>联系信息</span>
            <div class="baseLine"></div>

            <table style="width: 660px; margin: 0 auto; text-align: center">
                <tr>
                    <td>
                        <label>手机号码:</label><span><s:property value="#session.user.phone"/></span>
                    </td>
                    <td>
                        <label>邮件地址:</label><span><s:property value="#session.user.email"/></span>
                    </td>
                </tr>
            </table>

            <div class="baseLine" style="margin-left: 68px"></div>


        </div>

        <div class="form-content edit-form">
            <span>基本信息</span>
            <div class="baseLine"></div>
            <span class="edit edit-form-flag">提交</span>

            <table style="width: 660px; margin: 0 auto; text-align: center; margin-bottom: 20px">
                <tr>
                    <td>
                        <label>用户名:</label><input class="edit-value" type="text" value="Max">
                    </td>
                    <td>
                        <label>积分:</label><input class="edit-value" type="text" value="32000">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>性别:</label><input class="edit-value" type="text" value="男">
                    </td>
                    <td>
                        <label>注册时间:</label><input class="edit-value" type="text" value="2014-12-01 13:28:01">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>真实姓名:</label><input class="edit-value" type="text" value="继湘明">
                    </td>
                    <td>
                        <label>账户类型:</label><input class="edit-value" type="text" value="普通用户">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>身份证号:</label><input class="edit-value" type="text" value="440883199203211455">
                    </td>
                </tr>
            </table>


            <span>联系信息</span>
            <div class="baseLine"></div>

            <table style="width: 660px; margin: 0 auto; text-align: center">
                <tr>
                    <td>
                        <label>手机号码:</label><input class="edit-value" type="text" value="13692333814">
                    </td>
                    <td>
                        <label>邮件地址:</label><input class="edit-value" type="text" value="max@gmail.com">
                    </td>
                </tr>
            </table>

            <div class="baseLine" style="margin-left: 68px"></div>
        </div>


    </div>
</div>

    <script src="../js/userInfo.js"></script>
</body>
</html>