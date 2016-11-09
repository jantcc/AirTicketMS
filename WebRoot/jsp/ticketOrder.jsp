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
            <form method="post" action="findOrderById">
            <div class="searchBox">
                <div class="order-num">
                    <span>订单号</span>
                </div>
                <input type="text" name="myid">
                <div class="searchBtn">
                    <span><input type="submit" value="查询" style="width: 97px;height: 40px;background-color: red"/></span>
                </div>
            </div>
            </form>
            <form method="post" action="findOrderByDate">
            <div class="order-Date">
                <span>预定日期</span><input type="text" name="mytime"
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
  class="Wdate" >
<button>查询</button>
            </div>
            </form>
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
              
                <s:iterator value="#session.orderlist" id="order">
                	  <tr>
                    <td>
                        <p>订单ID：<s:property value="#order.id"/></p>
                        <p>下单时间</p>
                        <p style="width: 160px"><s:property value="#order.orderdate.toString().substring(0,19)"/></p>
                       <a href="#"> <p style="cursor: pointer">查看订单详情>></p> </a>
                    </td>
                    <td>
                        <p align="center"><s:property value="#order.flightid"/></p>
                        <p><s:property value="#order.startpoint"/> <s:property value="#order.startairport"/>--<s:property value="#order.endpoint"/> <s:property value="#order.endairport"/></p>
                        <p align="center"><s:property value="#order.starttime.toString().substring(10,19)"/> -<s:property value="#order.endtime.toString().substring(10,19)"/></p>
                        <p align="center" style="margin-top: 0px"><s:property value="#order.starttime.toString().substring(0,10)"/></p>
                    </td>
                    <td style="text-align: center;"><span><s:property value="#order.onplaneuser"/></span></td>
                    <td><span><s:property value="#order.price"/></span></td>
                    <td><span><s:property value="#order.orderstatus"/></span></td>
                    <td><span>
                    <s:if test='#order.orderstatus=="已完成"'>已完成</s:if>
                    <s:elseif test='#order.orderstatus=="等待取票"'><a href="changeorderstatus?id=<s:property value="#order.id"/>">退票</a></s:elseif>                                                   
                    <s:elseif test='#order.orderstatus=="已退票"'>已退票</s:elseif>
                    <s:elseif test='#order.orderstatus=="待付款"'><a href="#">付款</a> <a href="#">取消</a> </s:elseif>
                    <s:elseif test='#order.orderstatus=="已取消"'>已取消</s:elseif>
                    <s:elseif test='#order.orderstatus=="退票中"'>退票中</s:elseif>
                    </span></td>
                </tr>
                
                </s:iterator>
               
            </table>

        </div>
    </div>

</div>
<script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script>
</body>
</html>