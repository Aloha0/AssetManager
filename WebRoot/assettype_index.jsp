<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <h3>资产类别创建</h3>
	<form action="assettype!create" method="post">
		<p><label>资产类别名称：</label><input name="assettype.name" type="text"></p>
		<p><input type="submit" value="提交"></p>
	</form>    
	
	
	<h3>资产类别修改</h3>
	<form action="assettype!update" method="post">
		<p><label>资产类别ID：</label><input name="assettype.id" type="text"></p>
		<p><label>资产类别名称：</label><input name="assettype.name" type="text"></p>
		<p><input type="submit" value="提交"></p>
	</form>    
	
	<h3>资产类别删除</h3>
	<form action="assettype!remove" method="post">
		<p><label>资产ID：</label><input name="assettype.name" type="text"></p>
		<p><input type="submit" value="提交"></p>
	</form>    
	
	<h3>资产类别列表</h3>
	<form action="assettype" method="post">
		<p><input type="submit" value="提交"></p>
	</form>   
  </body>
</html>
