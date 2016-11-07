<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>booktickt</title>
    <link rel="stylesheet" href="../css/bookticket.css">
    <link rel="stylesheet" href="../css/kuCity.css">
    <link rel="stylesheet" href="../css/userInfo.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
    <link rel="stylesheet" href="../css/reset.css">
</head>
<body background="../img/header_back.jpg">
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
            <li class="nav-list " onclick="window.location.href='userInfo.jsp'">
                <span>我的信息</span>
                <i class="iconfont">&#xe627;</i>
            </li>
            <li class="nav-list nav-active" onclick="window.location.href='bookticket.jsp'">
                <span>预定行程</span>
                <i class="iconfont">&#xe683;</i>
            </li>

        </ul>
    </nav>
</div>

	<form action="showFlightscustom?locationurl=flights" method="post">
<div class="white">
<div class="buttom">
<p class="book">机票预订</p>
</div>

    <div class="buttomleft"></div>
    <div class="box">
    <div class="citychoose">
    <div class="startplace">
        <p>出发地</p>
        <input type="text" class="search" name="flights.startpoint">
        <i class="position">&#xe652;</i>
        <p style="margin-top: 30px;">时间</p>
        <input type="text" name="flights.starttime"
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
  class="Wdate" style="width: 168px;height: 35px;" />

      </div>
    <div class="endplace">
        <p>目的地</p>
        <input type="text" class="search" name="flights.endpoint">
        <i class="positiontwo">&#xe652;</i>
    </div>
    </div>



    <input class="subbutton" type="submit" value="立刻查询" style="margin-top: 200px;">
    </div>
</div>
</form>
<script src="../js/jquery-1.8.2.min.js" type="text/javascript"></script>
<script src="../js/kuCity.js"></script>
<script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $('.search').kuCity();
        $('.searchend').kuCity();
    });

var msg="${actionMessages[0]}";
if(msg!=""){
alert(msg);
}
</script>

</body>
</html>