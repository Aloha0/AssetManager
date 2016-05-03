<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link href="<%=path %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Font Awesome -->
<link href="<%=path %>/css/font-awesome.min.css" rel="stylesheet">

<!-- Simplify -->
<link href="<%=path %>/css/simplify.min.css" rel="stylesheet">

</head>
<body>

	
		<!--Modal-->
		
		<div class="modal fade lock-screen-wrapper" id="lockScreen">
			<div class="modal-dialog">
				<div class="modal-content">
				    <div class="modal-body">
				    	<form action="login" method="post">
				    
						<div class="lock-screen-img">
							<img src="images/profile/profile1.jpg" alt="">
						</div>
						
						<div class="text-center m-top-sm">
							<div class="h4 text-white">资产管理系统</div>
							<div class="input-group m-top-sm"> 
								<input type="text" name="username" class="form-control text-sm" placeholder="请输入用户名"> 
							<hr/>
							</div>							
							<div class="input-group m-top-sm"> 
								<input type="password" name="password" class="form-control text-sm" placeholder="请输入密码"> 
	
							</div><br>
							<div class="input-group m-top-sm"> 
								<input class="form-control text-sm"  type="submit" value="登录">
							</div>
						</div>

						
						</form>
				    </div>
			  	</div><!-- /.modal-content -->
			</div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

	    <!-- Le javascript
	    ================================================== -->
	    <!-- Placed at the end of the document so the pages load faster -->
	    
	    <!-- Jquery -->
		<script src="<%=path %>/js/jquery-1.11.1.min.js"></script>
	    
	    <!-- Bootstrap -->
	    <script src="<%=path %>/bootstrap/js/bootstrap.min.js"></script>
	   
		<!-- Modernizr -->
		<script src='<%=path %>/js/modernizr.min.js'></script>
	   
		<!-- Popup Overlay -->
		<script src='<%=path %>/js/jquery.popupoverlay.min.js'></script>
	   
	    <!-- Slimscroll -->
		<script src='<%=path %>/js/jquery.slimscroll.min.js'></script>
	   
		<!-- Simplify -->
		<script src="<%=path %>/js/simplify/simplify.js"></script>
		
		<script>
			$(function()	{
				$('#lockScreen').modal({
					show: true,
					backdrop: 'static'
				})
			});
		</script>	
	
</body>
</html>