<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>alreadyPlants</title>
    <link rel="stylesheet" href="../css/dashboard.css">
    <link rel="stylesheet" href="../css/alreadyPlants.css">
    <link rel="stylesheet" href="../iconfont/iconfont.css">
</head>
<body>
<header>
    <div align="center">
        <a href="bgindex.jsp"><font size="10" color="black">飞机航空后台管理系统</font></a>
    </div>
    <div align="right">
        <p>欢迎您,<s:if test='#session.user.authority=="1"'>
            管理员
        </s:if>
            <s:else>高级管理员</s:else>
            <s:property value="#session.user.username"/></p>
        <p><a href="userInfo.jsp">返回前台</a></p>
    </div>
    <div></div>
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
                <a href="showFlights">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>航空公司所有航班</span></li>
                </a>
                <a href="alreadyPlants.jsp">
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
                <a href="addCompany.jsp">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>增加航空公司</span></li>
                </a>
                <a href="showCompany">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>航空公司信息</span></li>
                </a>
                <a href="showCompany?locationurl=companyhaveplane">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>航空公司已有机型</span></li>
                </a>
            </ul>
            <a href="#plantType-manage" class="nav-a">
                <li class="nav-list"><i class="iconfont">&#xe600;</i><span class="list-title">机型管理</span><i
                        class="iconfont float-right">&#xe608;
                </i></li>
            </a>
            <ul class="nav-child-list" id="plantType-manage">
                <a href="showCompanyName">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>增加机型</span></li>
                </a>
                <a href="showAllPlaneModel">
                    <li class="nav-list" style="background-color: white;"><i class="iconfont">
                        &#xe609;</i><span>查询机型信息</span></li>
                </a>
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
    <div class="content">
        <div class="content-header">
            <i class="iconfont">&#xe607;</i>
            <i class="iconfont">&#xe606;</i>
            <span>增加航空公司</span>
        </div>
        <div class="content-title alreadyPlants">
            <div class="flag">
                <i class="iconfont">&#xe604;</i>
            </div>

            <h2 style="color: #0163c6; padding: 30px 0 0 20px; float: left">航空公司信息</h2>
        </div>

        <div class="table-container">
            <div class="table-container-header"><span>航空公司信息</span></div>
            <div class="subtitle">
                <span>show</span>
                <div class="show-select">
                    <select class="select-entries">
                        <option value="10">10</option>
                        <option value="10">9</option>
                        <option value="10">8</option>
                        <option value="10">7</option>
                    </select>
                    <i class="iconfont">&#xe615;</i>
                </div>
                <span>entries</span>

                <div class="search">
                    <label>Search:</label><input type="text">
                </div>
            </div>
            <table class="table-form" border = 0 cellspacing = 0 cellpadding = 0>
                <tr>
                    <td><span>ID</span></td>
                    <td><span>公司名</span></td>
                    <td><span>公司代号</span></td>
                    <td><span>公司信息</span></td>
                    <td><span>公司电话</span></td>
                    <td><span>公司网址</span></td>
                    <td><span>操作</span></td>
                </tr>
               <s:iterator value="#session.list" id="company">
               <tr>
               <td><span><s:property value="#company.id"/></span></td>
               <td><span><s:property value="#company.companyname"/></span></td>
               <td><span><s:property value="#company.companycode"/></span></td>	
               <td><span><s:property value="#company.companyinfo"/></span></td>
               <td><span><s:property value="#company.companyphone"/></span></td>
               <td><span><s:property value="#company.companyurl"/></span></td>
               <td><i class="iconfont">&#xe616;</i></td>
               </tr>         
               </s:iterator>
            </table>
            <div class="table-footer">
                <span>Showing 1 to 4 of entries</span>
                <div class="page">
                    <input type="button" value="First">
                    <input type="button" value="Previous">
                    <input class="pageNumber" type="text" placeholder="1">
                    <input type="button" value="Next">
                    <input type="button" value="Last">
                </div>
            </div>
        </div>


    </div>
</div>
<script src="../js/dashboard.js"></script>
</body>
</html>