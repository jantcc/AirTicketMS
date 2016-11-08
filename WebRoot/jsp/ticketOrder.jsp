<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>ticketOrder</title>
    <link rel="stylesheet" href="../css/ticketOrder.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
    <link rel="stylesheet" href="../css/reset.css">

</head>
<body>

<header>
    <div class="loginBox">
        <p>欢迎您,<s:property value="#session.user.username"/></p>
        <a href="bgindex.jsp">进入后台</a>
    </div>
</header>
<div class="sub-header">
    <nav class="sub-header-content">
        <ul>
            <li class="nav-list" onclick="window.location.href='userInfo.jsp'">
                <i class="iconfont">&#xe60b;</i>
            </li>
            <li class="nav-list nav-active" onclick="window.location.href='userInfo.jsp'">
                <span>我的信息</span>
                <i class="iconfont">&#xe627;</i>
            </li>
            <li class="nav-list" onclick="window.location.href='bookticket.jsp'">
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
                <li class="form-nav-list" onclick="window.location.href='userInfo.jsp'">
                    <i class="iconfont">&#xe60a;</i>
                    <span>个人信息</span>
                </li>
                <li class="form-nav-list">
                    <i class="iconfont">&#xe600;</i>
                    <span>机票订单</span>
                </li>
                <li class="form-nav-list" onclick="window.location.href='updatePassword.jsp'">
                    <i class="iconfont">&#xe73f;</i>
                    <span>更改密码</span>
                </li>
            </ul>
        </aside>
        <div class="search-Container">
            <p>*初始查询结果仅向您显示7天内的信息</p>
            <div class="searchBox">
                <div class="order-num">
                    <span>订单号</span>
                </div>
                <input type="text">
                <div class="searchBtn">
                    <i class="iconfont">&#xe60c;</i>
                    <span>查询</span>
                </div>
            </div>
            <div class="order-Date">
                <span>预定日期</span><input type="date"><button>查询</button>
            </div>
        </div>


        <div class="orders">
            <div class="orders-header">
                <div class="triangle-left"></div>
                <div class="triangle-right"></div>
                <table>
                    <tr>
                        <td style="width: 200px"><span>订单</span></td>
                        <td style="width: 200px"><span>航班信息</span></td>
                        <td><span>乘机人</span></td>
                        <td><span>总价</span></td>
                        <td><span>订单状态</span></td>
                        <td><span>操作</span></td>
                    </tr>
                </table>
            </div>
            <table class="orders-table">
                <tr>
                    <td>
                        <p>订单ID:224</p>
                        <p>下单时间</p>
                        <p>2014-12-03 21:56:50</p>
                        <p style="cursor: pointer">查看订单详情>></p>
                    </td>
                    <td>
                        <p>MU5104</p>
                        <p>上海 虹桥机场--广州 白云机场</p>
                        <p>16:30-18:55</p>
                        <p>2014-12-3</p>
                    </td>
                    <td><span>梁湘明</span></td>
                    <td><span>$1000</span></td>
                    <td><span>已完成</span></td>
                    <td><span>已完成</span></td>
                </tr>
                <tr>
                    <td>
                        <p>订单ID:224</p>
                        <p>下单时间</p>
                        <p>2014-12-03 21:56:50</p>
                        <p style="cursor: pointer">查看订单详情>></p>
                    </td>
                    <td>
                        <p>MU5104</p>
                        <p>上海 虹桥机场--广州 白云机场</p>
                        <p>16:30-18:55</p>
                        <p>2014-12-3</p>
                    </td>
                    <td><span>梁湘明</span></td>
                    <td><span>$1000</span></td>
                    <td><span>已完成</span></td>
                    <td><span>已完成</span></td>
                </tr>
                <tr>
                    <td>
                        <p>订单ID:224</p>
                        <p>下单时间</p>
                        <p>2014-12-03 21:56:50</p>
                        <p style="cursor: pointer">查看订单详情>></p>
                    </td>
                    <td>
                        <p>MU5104</p>
                        <p>上海 虹桥机场--广州 白云机场</p>
                        <p>16:30-18:55</p>
                        <p>2014-12-3</p>
                    </td>
                    <td><span>梁湘明</span></td>
                    <td><span>$1000</span></td>
                    <td><span>已完成</span></td>
                    <td><span>已完成</span></td>
                </tr>
                <tr>
                    <td>
                        <p>订单ID:224</p>
                        <p>下单时间</p>
                        <p>2014-12-03 21:56:50</p>
                        <p style="cursor: pointer">查看订单详情>></p>
                    </td>
                    <td>
                        <p>MU5104</p>
                        <p>上海 虹桥机场--广州 白云机场</p>
                        <p>16:30-18:55</p>
                        <p>2014-12-3</p>
                    </td>
                    <td><span>梁湘明</span></td>
                    <td><span>$1000</span></td>
                    <td><span>已完成</span></td>
                    <td><span>已完成</span></td>
                </tr>
            </table>

        </div>
    </div>

</div>
</body>
</html>