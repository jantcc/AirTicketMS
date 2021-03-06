<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Flights</title>
    <link rel="stylesheet" href="../css/userInfo.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
    <link rel="stylesheet" href="../css/flights.css">
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


<div class="content clearFlex">
    <div class="user-form clearFlex">
        <nav class="form-nav">
            <span>您的位置:首页 ></span>
            <span>航班选择</span>
        </nav>

        <aside style="margin-left: 360px">
        	<form action="showFlightscustom?locationurl=flights&flag=g" method="post">
            <ul>
                <li class="form-nav-list">
                    <span>起始地:</span>
                    <input id="deptCd" name="flights.startpoint" type="text" class="city"
                           value='<s:property value="#session.flightlist[0].startpoint"/>'>
                </li>
                <li class="form-nav-list">
                    <span>目的地:</span>
                    <input id="arrDd" name="flights.endpoint" type="text" class="input city"
                           value='<s:property value="#session.flightlist[0].endpoint"/>'>
                </li>
                <li class="form-nav-list">
                    <span>时间:</span>
                    <input type="text" name="flights.starttime"
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
  value='<s:property value="#session.flightlist[0].starttime.toString().substring(0,10)"/>'
  class="Wdate" />
                    
                </li>
                <input type="submit" name="search" value="搜 索" id="btn_flight_search">

            </ul>
            </form>
        </aside>
        <div class="orders">
            <div class="orders-header">
                <div class="triangle-left"></div>
                <div class="triangle-right"></div>
                <table>
                    <tr>
                        <td><span>航空公司</span></td>
                        <td><span>航班号</span></td>
                        <td style="width: 100px"><span>起飞</span></td>
                        <td style="width: 120px"><span></span></td>
                        <td style="width: 100px"><span>到达</span></td>
                        <td><span>头等仓数量</span></td>
                        <td><span>经济舱数量</span></td>
                        <td><span>商务仓数量</span></td>
                        <td><span>操作</span></td>
                    </tr>
                </table>
            </div>
            <form method="post" action="showOrders" on>
            <table class="orders-table">
              <input type="hidden"  id="myid" name="myid" value="" />          
                <s:iterator value="#session.flightlist" id="flight">
                <tr>
                    <td style="width: 72px"><span><s:property value="#flight.companyname" /></span></td>
                	<td style="width: 72px"><s:property value="#flight.flightid"/></td>
                	<td style="width: 100px; border-right: none">
                		 <p><s:property value="#flight.startpoint"/><s:property value="#flight.startairport"/></p>
                		 <span><s:property value="#flight.starttime.toString().substring(10,19)"/></span>
                	</td>
                	<td style="border-right: none; text-align: center"><span>------></span></td>
                    <td style="width: 100px">
                         <p><s:property value="#flight.endpoint"/><s:property value="#flight.endairport"/></p>
                		 <span><s:property value="#flight.endtime.toString().substring(10,19)"/></span>
                	</td>
                	<s:iterator value="#session.plist" id="planemodel">
                	<s:if test="#planemodel.planemodelcode==#flight.planemodelcode">
                	<td style="width: 90px"><span><s:property value="#planemodel.firstclassnumber"/><input type="radio" name="planemodeltype" value="头等舱"/></span></td>
                    <td style="width: 86px"><span><s:property value="#planemodel.businessclassnumber"/><input type="radio" name="planemodeltype" value="经济舱"/></span></td>
                    <td style="width: 86px"><span><s:property value="#planemodel.economyclassnumber"/><input type="radio" name="planemodeltype" value="商务舱"/></span></td>
                  </s:if>
                    </s:iterator>
                	<td style="width: 70px;"><input type="submit"  value="预定" style="cursor: pointer;" class="iconfont" onclick="setid(<s:property value="#flight.id" />);"/></td>
                	</tr>
                </s:iterator>
            </table>
			</form>
        </div>

    </div>
</div>
<script src="../js/checkpassword.js"></script>
<script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
var msg="${actionMessages[0]}";
if(msg!=""){
alert(msg);
}
function setid(x){
	var i = document.getElementById("myid");
	i.value=x;
}
</script>
</body>
</html>