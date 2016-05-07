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
<title>资产管理</title>
  <%@include file="../header.html" %>


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
		                资产归还 <small> </small>
		            </h3>
		            <br/>
		        </div>
		    </div>
		    <div class="clearfix"></div>
		 
		    <div class="row">
		        <div class="col-md-12">

				    <div class="x_panel">
		                <div class="x_title">
		                  <h2>资产列表 </h2>
		                  <ul class="nav navbar-right panel_toolbox">
							<li><input id="search_assetreturn" type="text" class="form-control col-md-7" ></li>
		                    <li><a href="javascript:void(0)" onclick="search_asset_return()" ><i class="fa fa-plus"></i>查找</a>
		                    </li>

		                  </ul>
		                  <div class="clearfix"></div>
		                </div>
		                <div class="x_content">
		                  <table id="asset_return_table" data-unique-id= "id"  data-toggle="table" class="table table-striped">
		       

		                  </table>
		
		                </div>
		              </div>
		        </div>
		    </div>
		    
        </div>
    </div>
    
<!-- 模态框（Modal） -->
<div class="modal fade"  id="asset-get-modal" tabindex="-1" role="dialog" 
   aria-labelledby=""  >
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
           领用资产
            </h4>
         </div>
         <div class="modal-body">
            <form id="form_asset_get" action="" class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_name">
            		资产名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="assetreturn_name_text" required="required" class="form-control col-md-7" />
            			<input type="text" name="asset_id_text" required="required" class=" form-control col-md-7 hide" />       <!-- hide -->

            		</div>
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		资产类别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 
            	
            	</div>
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		领用人ID:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="recipient_id_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 
            
            </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_asset_get()" type="button" class="btn btn-primary">确认领用
            </button>
         </div>
      </div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->

<!-- 模态框（Modal） -->
<div class="modal fade"  id="asset-return-modal" tabindex="-1" role="dialog" 
   aria-labelledby=""  >
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
           归还资产
            </h4>
         </div>
         <div class="modal-body">
            <form id="form_asset_return" action="" class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_name">
            		资产名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="assetreturn_name_text" required="required" class="form-control col-md-7" />
            			<input type="text" name="asset_id_text" required="required" class=" form-control col-md-7 hide" />    <!-- hide -->

            		</div>
            	</div>
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		资产类别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 
            	
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		领用人ID:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="recipient_id_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 
            	
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		归还人ID:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="returner_id_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 
            
            </form>
         	</div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_asset_return()" type="button" class="btn btn-primary">确认归还
            </button>
         </div>
      </div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->

  <%@include file="../footer.html" %>
  <script src="<%=basePath %>/asset/asset_return.js" type="text/javascript"></script>
    
</body>
</html>