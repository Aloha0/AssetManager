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
	<title>用户管理</title>
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
		                系统管理 <small>用户管理 </small>
		            </h3>
		            <br/>
		        </div>
		    </div>
		    <div class="clearfix"></div>
		 
		    <div class="row">
		        <div class="col-md-12">

				    <div class="x_panel">
		                <div class="x_title">
		                  <h2>用户列表 <small>用户信息管理</small></h2>
		                  <ul class="nav navbar-right panel_toolbox">

		                    <li><a href="javascript:void(0)" onclick="open_useradd_dialog()" ><i class="fa fa-plus"></i>添加</a>
		                    </li>
		                  </ul>
		                  <div class="clearfix"></div>
		                </div>
		                <div class="x_content">
		                  <table id="user_table"  data-toggle="table" class="table table-striped">
		                  
		                  </table>
		
		                </div>
		              </div>
		        </div>
		    </div>
		    
        </div>
    </div>
    
    
<!-- 模态框（Modal） -->
<div class="modal fade "  id="user-add-modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              添加用户
            </h4>
         </div>
         <div class="modal-body">
            <form id="form_add_user" action="" class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="depart_name">
            		用户名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="user_name_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="depart_name">
            		用户密码:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="user_pwd_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="depart_name">
            		性  别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            		  <label>
					    <input type="radio" name="user_sex_text"  value="1" checked>
					    	男
					  </label>
					  <label>
					    <input type="radio" name="user_sex_text"  value="0" checked>
					    	女
					  </label>
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="depart_name">
            		所属部门:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<select required="required" name="user_depart_text" class="selectpicker" class="form-control col-md-7"></select>
            		</div>
            	</div>      
            </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_user_add()" type="button" class="btn btn-primary">提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>


  <%@ include file="../footer.html"%>

  <script src="<%=basePath %>/asset/user.js" type="text/javascript"></script>
    
</body>
</html>