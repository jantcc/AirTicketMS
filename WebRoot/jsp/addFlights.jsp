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
            <a href="#" class="nav-a">
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
            <a href="#" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe600;</i><span class="list-title">航班信息管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <a href="#" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe605;</i><span class="list-title">航空公司管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <a href="#" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe600;</i><span class="list-title">机型管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
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
    <div class="content">
        <div class="content-header">
            <i class="iconfont">&#xe607;</i>
            <i class="iconfont">&#xe606;</i>
            <span>增加航班信息</span>
        </div>
        <div class="content-title">
            <div class="flag">
                <i class="iconfont">&#xe604;</i>
            </div>
            <div class="title">
                <h2>添加航班</h2>
            </div>
            <div class="selectBox">
                <select name="companyName" id="addFlights">
                    <option value="中国国航">中国国航</option>
                    <option value="山东航空">山东航空</option>
                    <option value="四川航空">四川航空</option>
                </select>
                <i class="iconfont">&#xe615;</i>
            </div>
            <input type="submit" class="addFlights-submit" value="提交">
        </div>


        <div class="addFlights-form">
            <div class="form-header"><span>添加航空公司</span></div>
            <p>
                <label>航班号:</label> <input type="text">
            </p>
            <p>
                <label>出发地:</label> <input type="text">
            </p>
            <p>
                <label>到达地:</label> <input type="text">
            </p>
            <p>
                <label>出发机场:</label> <input type="text">
            </p>
            <p>
                <label>到达机场:</label> <input type="text">
            </p>
            <p>
                <label>出发时间:</label> <input type="text" 
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'HH:mm:ss'})"
  class="Wdate" >
            </p>
            <p>
                <label>到达时间:</label> <input type="text" 
  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'HH:mm:ss'})"
  class="Wdate" >
            </p>
            	<p>
                <label>头等舱价格:</label> <input type="text"  name=""
												 />
			</p>
            	<p>
				<label>公务舱价格:</label> <input type="text"  name=""
												 />
		    </p>
				<p>
				<label>经济舱价格:</label> <input type="text"  name=""
												 />
			</p>
				<p>
				<label>机型:</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<select name="planeModelCode" style="width:290px">
					<s:iterator value="#session.allPlaneModel">
							<option value="<s:property value="planeModelCode"/>"><s:property
										value="planeModelCode" />
								</option>
					  </s:iterator>
								</select>
			</p>
				<p align="center" style="margin-top: 5px;">
					<input name="companyName" value="${company.companyName }" hidden="hidden" type="text" style="display: none;">
					<input type="submit" class="addFlights-submit" style="width: 80px;height: 30px;">
				</p>
        </div>
    </div>
</div>
<script src="../js/dashboard.js"></script>
<script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script> 
</body>
</html>