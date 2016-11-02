<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
    <meta charset="UTF-8">
    <title>companyList</title>
    <link rel="stylesheet" href="../css/dashboard.css">
    <link rel="stylesheet" href="../css/companyList.css">
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
            <span>增加航空公司</span>
        </div>
        <div class="content-title">
            <div class="flag">
                <i class="iconfont">&#xe604;</i>
            </div>
            <div class="selectBox">
                <select name="companyName" id="select-company">
                    <option value="中国国航">中国国航</option>
                    <option value="山东航空">山东航空</option>
                    <option value="四川航空">四川航空</option>
                </select>
                <i class="iconfont">&#xe615;</i>
            </div>
            <input type="submit" value="提交">
        </div>

        <div class="table-container">
            <div class="table-container-header"><span>(东方航空)已经拥有机型</span></div>
            <table class="table-form" border = 0 cellspacing = 0 cellpadding = 0>
                <tr>
                    <td><span>机型ID</span></td>
                    <td><span>机型号</span></td>
                    <td><span>头等舱总数量</span></td>
                    <td><span>公务舱总数量</span></td>
                    <td><span>经济舱总数量</span></td>
                    <td><span>操作</span></td>
                </tr>
                <tr>
                    <td><span>41</span></td>
                    <td><span>波音747-400</span></td>
                    <td><span>12</span></td>
                    <td><span>36</span></td>
                    <td><span>70</span></td>
                    <td><i class="iconfont">&#xe616;</i></td>
                </tr>
                <tr>
                    <td><span>42</span></td>
                    <td><span>A330-300</span></td>
                    <td><span>22</span></td>
                    <td><span>52</span></td>
                    <td><span>150</span></td>
                    <td><i class="iconfont">&#xe616;</i></td>
                </tr>

            </table>
        </div>

        <div class="table-container">
            <div class="table-container-header"><span>可添加的机型</span></div>
            <table class="table-form" border = 0 cellspacing = 0 cellpadding = 0>
                <tr>
                    <td><span>机型ID</span></td>
                    <td><span>机型号</span></td>
                    <td><span>头等舱总数量</span></td>
                    <td><span>公务舱总数量</span></td>
                    <td><span>经济舱总数量</span></td>
                    <td><span>操作</span></td>
                </tr>
                <tr>
                    <td><span>61</span></td>
                    <td><span>33-A</span></td>
                    <td><span>15</span></td>
                    <td><span>30</span></td>
                    <td><span>150</span></td>
                    <td><i class="iconfont">&#xe616;</i></td>
                </tr>
                <tr>
                    <td><span>43</span></td>
                    <td><span>波音-767-200</span></td>
                    <td><span>21</span></td>
                    <td><span>65</span></td>
                    <td><span>224</span></td>
                    <td><i class="iconfont">&#xe616;</i></td>
                </tr>
                <tr>
                    <td><span>44</span></td>
                    <td><span>波音-777-200</span></td>
                    <td><span>13</span></td>
                    <td><span>54</span></td>
                    <td><span>227</span></td>
                    <td><i class="iconfont">&#xe616;</i></td>
                </tr>

            </table>
        </div>
    </div>
</div>
<script src="../js/dashboard.js"></script>
</body>
</html>