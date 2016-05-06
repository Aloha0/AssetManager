<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>

<body>
<div class="col-md-3 left_col" style="position:fixed">
    <div tabindex="5000" style="overflow: hidden; cursor: pointer;" class="left_col scroll-view">

        <div class="navbar nav_title" style="border: 0;">
        <a href="<%=basePath %>index.jsp" class="site_title"> <span>资产管理系统</span></a>
        </div>
        <div class="clearfix"></div>

        <!-- menu prile quick info -->
        <div class="profile">
        <div class="profile_pic">
            <img src="<%=basePath %>/images/img.jpg" alt="..." class="img-circle profile_img">
        </div>
        <div class="profile_info">
            <span>欢迎登陆</span>
            <h2>John Doe</h2>
        </div>
        </div>
        <!-- /menu prile quick info -->

        <br>

        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

        <div class="menu_section">
            <h3>General</h3>
            <ul class="nav side-menu">
            <li class=""><a href="<%=basePath %>index.jsp"><i class="fa fa-home"></i> 主页</a>

            </li>
            <li class=""><a><i class="fa fa-home"></i> 系统管理 <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li class=""><a href="<%=basePath %>manager/user.jsp">用户管理</a>
                </li>
                <li><a href="<%=basePath %>manager/deploy.jsp">管理配置</a>
                </li>
                <li><a href="<%=basePath %>manager/setting.jsp">参数管理</a>
                </li>
                </ul>
            </li>
            <li class=""><a><i class="fa fa-edit"></i> 资产管理 <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li><a href="<%=basePath %>manager/asset.jsp">资产列表</a>
                </li>
                <li><a href="<%=basePath %>manager/purchase.jsp">采购入库</a>
                </li>
                <li><a href="#b">财务入库</a>
                </li>
                <li><a href="<%=basePath %>manager/asset_return.jsp">资产归还</a>
                </li>
                </ul>
            </li>
            <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li><a href="general_elements.html">General Elements</a>
                </li>
                <li><a href="media_gallery.html">Media Gallery</a>
                </li>
                <li><a href="typography.html">Typography</a>
                </li>
                <li><a href="icons.html">Icons</a>
                </li>
                <li><a href="glyphicons.html">Glyphicons</a>
                </li>
                <li><a href="widgets.html">Widgets</a>
                </li>
                <li><a href="invoice.html">Invoice</a>
                </li>
                <li><a href="inbox.html">Inbox</a>
                </li>
                <li><a href="calender.html">Calender</a>
                </li>
                </ul>
            </li>
            <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li><a href="tables.html">Tables</a>
                </li>
                <li><a href="tables_dynamic.html">Table Dynamic</a>
                </li>
                </ul>
            </li>
            <li><a><i class="fa fa-bar-chart-o"></i> Data Presentation <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li><a href="chartjs.html">Chart JS</a>
                </li>
                <li><a href="chartjs2.html">Chart JS2</a>
                </li>
                <li><a href="morisjs.html">Moris JS</a>
                </li>
                <li><a href="echarts.html">ECharts </a>
                </li>
                <li><a href="other_charts.html">Other Charts </a>
                </li>
                </ul>
            </li>
            </ul>
        </div>
        <div class="menu_section">
            <h3>Live On</h3>
            <ul class="nav side-menu">
            <li><a><i class="fa fa-bug"></i> Additional Pages <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li><a href="e_commerce.html">E-commerce</a>
                </li>
                <li><a href="projects.html">Projects</a>
                </li>
                <li><a href="project_detail.html">Project Detail</a>
                </li>
                <li><a href="contacts.html">Contacts</a>
                </li>
                <li><a href="profile.html">Profile</a>
                </li>
                </ul>
            </li>
            <li><a><i class="fa fa-windows"></i> Extras <span class="fa fa-chevron-down"></span></a>
                <ul class="nav child_menu" style="display: none;">
                <li><a href="page_404.html">404 Error</a>
                </li>
                <li><a href="page_500.html">500 Error</a>
                </li>
                <li><a href="plain_page.html">Plain Page</a>
                </li>
                <li><a href="login.html">Login Page</a>
                </li>
                <li><a href="pricing_tables.html">Pricing Tables</a>
                </li>

                </ul>
            </li>
            <li><a><i class="fa fa-laptop"></i> Landing Page </a>
            </li>
            </ul>
        </div>

        </div>
        <!-- /sidebar menu -->

    </div>

</div>

</body>
 </html>