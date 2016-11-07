<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>addFlights</title>
    <link rel="stylesheet" href="../css/dashboard.css">
    <link rel="stylesheet" href="../css/addFlights.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
</head>
<body>
    <header>
                <div align="center">
           <a href="bgindex.jsp"><font size="10" color="black">飞机航空后台管理系统</font></a>
            </div>
    </header>
<div class="container">
           <aside>
        <div class="navbar-header"><span>NAVIGATION</span></div>
        <ul class="nav-bar-container">
            <a href="bgindex.jsp" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe603;</i><span class="list-title">首页</span></li>
            </a>
            <a href="#user-info" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe605;</i><span class="list-title">订票管理系统</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <ul class="nav-child-list" id="user-info">
                <li class="nav-list"><i class="iconfont">&#xe609;</i><span>增加客户信息</span></li>
                <li class="nav-list"><i class="iconfont">&#xe609;</i><span>查询客户信息</span></li>
            </ul>

            <a href="#" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe601;</i><span class="list-title">航班机票管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <a href="#airSchedul-manage" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe600;</i><span class="list-title">航班信息管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <ul class="nav-child-list" id="airSchedul-manage">
                <a href="showCompany?locationurl=addFlights">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>增加航班信息</span></li>
                </a>
                <a href="#">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>航空公司所有航班</span></li>
                </a>
                <a href="#">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>航空公司已有航班</span></li>
                </a>

            </ul>
            <a href="#airCompany-manage" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe605;</i><span class="list-title">航空公司管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <ul class="nav-child-list" id="airCompany-manage">
                <a href="addCompany.jsp" ><li class="nav-list" style="background-color: white;"><i class="iconfont">&#xe609;</i><span>增加航空公司</span></li></a>
                <a href="showCompany" ><li class="nav-list" style="background-color: white;"><i class="iconfont">&#xe609;</i><span>航空公司信息</span></li></a>
                <a href="showCompany?locationurl=companyhaveplane" ><li class="nav-list" style="background-color: white;"><i class="iconfont">&#xe609;</i><span>航空公司已有机型</span></li></a>           		
            </ul>
            <a href="#plantType-manage" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe600;</i><span class="list-title">机型管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <ul class="nav-child-list" id="plantType-manage">
               <a href="showCompanyName"><li class="nav-list" style="background-color: white;"><i class="iconfont">&#xe609;</i><span>增加机型</span></li></a>
               <a href="showAllPlaneModel"><li class="nav-list" style="background-color: white;"><i class="iconfont">&#xe609;</i><span>查询机型信息</span></li></a>
            </ul>
            <a href="#" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe602;</i><span class="list-title">报表打印管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <a href="#user-manage" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe60a;</i><span class="list-title">人员用户管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <ul class="nav-child-list" id="user-manage">
                <li class="nav-list"><i class="iconfont">&#xe609;</i><span>增加普通管理员</span></li>
                <li class="nav-list"><i class="iconfont">&#xe609;</i><span>查询普通管理员</span></li>
            </ul>
        </ul>
    </aside>
    <form method="post" action="addFlights">
    <div class="content">
        <div class="content-header">
            <i class="iconfont">&#xe607;</i>
            <i class="iconfont">&#xe606;</i>
            <span>添加航班</span>
        </div>
        <div class="content-title">
            <div class="flag">
                <i class="iconfont">&#xe604;</i>
            </div>
            <div class="title" style="width: 200px;">
                <h2>请选择航空公司</h2>
            </div>
            <div class="selectBox">
                <select name="flights.companyname" id="addFlights">            
                    <s:iterator value="#session.list" id="company">
                    	<option value="<s:property value="#company.companyname"/>"><s:property value="#company.companyname"/></option>
                    </s:iterator>
                </select>
                <i class="iconfont">&#xe615;</i>
            </div>
        </div>


        <div class="addFlights-form">
            <div class="form-header"><span>添加航班</span></div>
            <p>
                <label>航班号:</label> <input type="text" name="flights.flightid">
            </p>
            <p>
                <label>出发地:</label> <input type="text" name="flights.startpoint">
            </p>
            <p>
                <label>到达地:</label> <input type="text" name="flights.endpoint">
            </p>
            <p>
                <label>出发机场:</label> <input type="text" name="flights.startairport">
            </p>
            <p>
                <label>到达机场:</label> <input type="text" name="flights.endairport">
            </p>
            <p>
                <label>出发时间:</label> <input type="text" name="flights.starttime"
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})"
  class="Wdate" >
            </p>
            <p>
                <label>到达时间:</label> <input type="text" name="flights.endtime"
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})"
  class="Wdate" >
            </p>
            	<p>
                <label>头等舱价格:</label> <input type="text"  name="carbinprice.firstprice"
												 />
			</p>
            	<p>
				<label>公务舱价格:</label> <input type="text"  name="carbinprice.economyprice"
												 />
		    </p>
				<p>
				<label>经济舱价格:</label> <input type="text"  name="carbinprice.businessprice"
												 />
			</p>
				<p>
				<label>机型:</label> &nbsp;&nbsp;
				<select name="flights.planemodelcode" style="width:290px">
					<s:iterator value="#session.planemodellist" id="plist">
							<option value="<s:property value="#plist.planemodelcode"/>"><s:property
										value="#plist.planemodelcode" />
								</option>
					  </s:iterator>
								</select>
			</p>
				<p align="center" style="margin-top: 5px;">
					<input name="" value="" hidden="hidden" type="text" style="display: none;">
					<input type="submit" class="addFlights-submit" style="width: 80px;height: 30px;" value="添加">
				</p>
        </div>
    </div>
    </form>
</div>
<script src="../js/dashboard.js"></script>
<script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script> 
</body>
</html>