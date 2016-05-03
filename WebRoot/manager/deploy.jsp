<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>管理配置</title>
	
	<%@ include file="../header.html"%>
</head>


<body class="nav-md pace-done">
	<c:set var="basePath" value="${pageContext.request.contextPath}" />
	
    <div class="container body" >

		<s:include value="../side_bar.jsp"></s:include>
		<s:include value="../top_bar.jsp"></s:include>
		

        <div class="right_col" role="main" style="min-height: 950px">
		    <div class="page-title">
		        <div class="title_left">
		            <h3>
		                系统管理 <small>管理配置 </small>
		            </h3>
		            <br/>
		        </div>
		    </div>
		    <div class="clearfix"></div>
		 
		    <div class="row">

		    
		        <div class="col-md-12">  
				    <div class="x_panel">
		                <div class="x_title">
		                  <h2>部门管理 <small></small></h2>
		                  <ul class="nav navbar-right panel_toolbox">

		                    <li><a href="" data-toggle="modal" data-target="#depart-add-modal" ><i class="fa fa-plus"></i>添加</a>
		                    </li>

		                  </ul>
		                  <div class="clearfix"></div>
		                </div>
		                <div class="x_content">
		
		    		<table id="depart_table"  data-unique-id= "id" class="table table-striped"  data-toggle="table" >

			        </table>

		                </div>
		              </div>
		        </div>
		    </div>
		    <hr/>
		    <div class="row">
		        <div class="col-md-12">  
				    <div class="x_panel">
		                <div class="x_title">
		                  <h2>资产类型管理 <small></small></h2>
		                  <ul class="nav navbar-right panel_toolbox">

		                    <li><a href="" data-toggle="modal" data-target="#assettype-add-modal" ><i class="fa fa-plus"></i>添加</a>
		                    </li>
		                  </ul>
		                  <div class="clearfix"></div>
		                </div>
		                <div class="x_content">
		                  <table id="asset_type_table" data-unique-id= "id" data-toggle="table" class="table table-striped">
		                  
		                  </table>
		
		                </div>
		              </div>
		        </div>
		    </div>
		    
		    
		    <s:include value="deploy_add.jsp"></s:include>
		    
        </div>

    </div>


	<%@ include file="../footer.html"%>
	<script src="<%=basePath %>/asset/deploy.js" type="text/javascript"></script>

    
</body>
</html>