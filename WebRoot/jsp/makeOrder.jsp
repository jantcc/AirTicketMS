<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>makeOrder</title>
    <link rel="stylesheet" href="../css/userInfo.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
    <link rel="stylesheet" href="../css/makeOrder.css">
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
<section class="content clearFlex">
    <nav class="form-nav">
        <span>您的位置:首页 ></span>
        <span>航班选择</span>
    </nav>
    <form method="post" action="addOrder">
    <input type="hidden" name="myflightid" value="<s:property value="#session.flight.flightid"/>"/>
   	<input type="hidden" name="myneedtype" value="<s:property value="#session.type"/>"/>
    <section class="order-container clearFlex">
        <div class="order-info info-container">
            <div class="orderInfo-header">
                <span>订单信息</span>
            </div>
            <div class="order-content">
                <div class="col-20" style="line-height: 86px">
                    <span>去程</span>
                </div>
                <div class="col-20">
                    <h2><s:property value="#session.flight.startpoint"/> <s:property value="#session.flight.starttime.toString().substring(10,16)"/></h2>
                    <p><s:property value="#session.flight.starttime.toString().substring(0,10)"/></p>
                    <p><s:property value="#session.flight.startairport"/></p>
                </div>
                <div class="col-20">
                    <p style="margin-top: 18px"><s:property value="#session.flight.companyname"/></p>
                    <p><s:property value="#session.flight.flightid"/></p>
                    <p><s:property value="#session.type"/></p>
                </div>
                <div class="col-20">
                    <h2><s:property value="#session.flight.endpoint"/> <s:property value="#session.flight.endtime.toString().substring(10,16)"/></h2>
                    <p><s:property value="#session.flight.endtime.toString().substring(0,10)"/></p>
                    <p><s:property value="#session.flight.endairport"/></p>
                </div>
                <div class="col-20"><span style="cursor: pointer" onclick="window.location.href='flights.jsp'">修改航班</span></div>
            </div>
        </div>

        <div class="info-container clearFlex">
            <div class="passengerInfo">
                <header><span>填写乘机人资料</span></header>
                <div class="info-form">
                   		
                        <input type="radio" checked="checked" name="age" value="adult" id="adult" onclick="changeprice()"><label>成人</label>
                        <input type="radio" name="age" value="child" id="child" onclick="changeprice()"><label>儿童</label>
                       	
                        <p>
                            <label><span style="color: red">*</span>旅客姓名:</label><input type="text" class="pass-input" name="order.onplaneuser">
                        </p>
                        <p>
                            <label><span style="color: red">*</span>证件号码:</label><input type="text" class="pass-input" name="order.onplaneuseridcard">
                        </p>
          
                </div>
            </div>

            <div class="passenger-list">
                <header><span>乘机人名单</span></header>
                <div class="list-content">
                    <p>基本票价:<s:property value="#session.baseprice"/></p>
                    <p>账号类型:<s:property value="#session.myuserType"/></p>
                    <p>享有折扣:<s:if test='#session.myuserType=="普通客户"'>
                                                                  无折扣
                    </s:if>
                   <s:else>
                    <s:property value="#session.myuserType.substring(0,2)"/>价
                   </s:else>                  
                    </p>
                    <div class="baseLine"></div>
                    <p>订单总价: 
                    <input type="text" id="adultprice" name="myadultprice" value="<s:property value="#session.adultprice"/>" style="color: red;background: none;border: none;width: 50px;font-size: 15pt;" />
                    <input type="hidden" id="childprice" name="mychildprice" value="<s:property value="#session.childprice"/>" style="color: red;background: none;border: none;width: 50px;font-size: 15pt;" />
                    </p>
                </div>
            </div>
        </div>

        <div class="info-container clearFlex">
            <div class="passengerInfo">
                <header><span>填写乘机人资料</span></header>
                <div class="contact-form">
                    
                        <p>
                            <label>地址:</label><input type="text" class="pass-input" name="order.address">
                        </p>
                        <p>
                            <label><span style="color: red">*</span>移动电话:</label><input type="text" class="pass-input" name="order.onplaneuserphone">
                        </p>
                 

                </div>

            </div>
        </div>

        <div align="center">
            <span><input type="submit" value="确认并提交订单" class="submit-btn"/></span>
        </div>
    </section>
    </form>
</section>
<script src="../js/jquery-1.8.2.min.js"></script>
<script src="../js/checkpassword.js"></script>

    <script type="text/javascript">
    function changeprice(){
	var adultradio = document.getElementById("adult");
	var childradio = document.getElementById("child");
	var adultprice = document.getElementById("adultprice");
	var childprice = document.getElementById("childprice");
	var price = document.getElementById("price");
	if(adultradio.checked){
	$("#adultprice").attr('type','text');
	$("#childprice").attr('type','hidden');
	}else if(childradio.checked){
	$("#adultprice").attr('type','hidden');
	$("#childprice").attr('type','text');
	}
	}

</script>
</body>
</html>