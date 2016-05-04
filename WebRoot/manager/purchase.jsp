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
<title>采购管理</title>
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
		                采购管理 <small> </small>
		            </h3>
		            <br/>
		        </div>
		    </div>
		    <div class="clearfix"></div>
		 
		    <div class="row">
		        <div class="col-md-12">

				    <div class="x_panel">
		                <div class="x_title">
		                  <h2>采购单列表 </h2>
		                  <ul class="nav navbar-right panel_toolbox" style="padding-top: 10px;padding-left: 5px">
		                    <li><a href="" data-toggle="modal" data-target="#purchase-add-modal" ><i class="fa fa-plus"></i>采购入库</a>
		                    </li>
		                  </ul>
		                  <div class="clearfix"></div>
		                </div>
		                <div class="x_content">
		                  <table id="purchase_table"  data-toggle="table"  data-unique-id= "id" class="table table-striped">
		                  </table>
		
		                </div>
		              </div>
		        </div>
		    </div>
		    
        </div>
    </div>
    

	<!-- 模态框（Modal） -->
   <div class="modal fade " data-backdrop="false"  id="purchase-add-modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              采购入库
            </h4>
         </div>
         <form id="form_add_purchase" action="" class="form-horizontal form-label-left">
         <div class="modal-body">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_name_text">
            		资产名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="purchase_name_text" required="required" class="form-control col-md-7" />
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
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		资产型号:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="purchase_model_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		数量:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" name="purchase_num_text" required="required" class="form-control" />
            		</div>
            		
            		<label class="control-label col-md-2" for="setting_type_text">
            		单位:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" name="purchase_unit_text" required="required" class="form-control" />
            		</div>
            	</div>    
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		制造商:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" name="purchase_maker_text" required="required" class="form-control" />
            		</div>
            		
            		<label class="control-label col-md-2" for="setting_type_text">
            		供货商:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" name="purchase_supply_text" required="required" class="form-control" />
            		</div>
            	</div>   
            	
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		单价:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" name="purchase_price_text" required="required" class="form-control" />
            		</div>
            		
            	</div>   
            	
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="purchase_purpose_text">
            		采购用途:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="purchase_purpose_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		备注:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<textarea rows="3" name="purchase_remark_text" cols="" class="form-control col-md-7" placeholder="备注"></textarea>
            		</div>
            	</div>  
         </div>
         <div class="modal-footer">

            <input type="reset" class="btn btn-default" value="重置"/>
            <input type="button" data-dismiss="modal" class="btn btn-default" value="关闭"/>
            <button id="from_add_btn" onclick="ajax_purchase_add()" type="button" class="btn btn-primary">提交更改
            </button>
         </div>
         </form>
         
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>


	<!-- 模态框（Modal） -->
   <div class="modal fade " data-backdrop="false"  id="purchase-show-modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              查看采购详情
            </h4>
         </div>
         <form id="form_show_purchase" action="" class="form-horizontal form-label-left">
         <div class="modal-body">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_name_text">
            		资产名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="purchase_name_text" required="required" class="form-control col-md-7" />
            		</div>
            		
            	</div>
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		资产类别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="asset_type_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 

            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		资产型号:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="purchase_model_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		数量:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_num_text" required="required" class="form-control" />
            		</div>
            		
            		<label class="control-label col-md-2" for="setting_type_text">
            		单位:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_unit_text" required="required" class="form-control" />
            		</div>
            	</div>    
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		制造商:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_maker_text" required="required" class="form-control" />
            		</div>
            		
            		<label class="control-label col-md-2" for="setting_type_text">
            		供货商:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_supply_text" required="required" class="form-control" />
            		</div>
            	</div>   
            	
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		单价:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_price_text" required="required" class="form-control" />
            		</div>
            		
            	</div>   
            	
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="purchase_purpose_text">
            		采购用途:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="purchase_purpose_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		备注:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<textarea rows="3"  name="purchase_remark_text" cols="" class="form-control col-md-7" ></textarea>
            		</div>
            	</div>  
         </div>
         </form>
         
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>

	<!-- 模态框（Modal） -->
   <div class="modal fade " data-backdrop="false"  id="finance-add-modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              财务入库
            </h4>
         </div>
         <form id="form_add_finance" action="" class="form-horizontal form-label-left">
         <div class="modal-body">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_name_text">
            		资产名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="purchase_name_text" required="required" class="form-control col-md-7" />
            		    <input type="text" disabled="disabled" name="finance_id_text" required="required" class="hide form-control col-md-7" />
            		</div>
            		
            	</div>
             	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_val_text">
            		资产类别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="asset_type_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div> 

            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		资产型号:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="purchase_model_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		数量:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_num_text" required="required" class="form-control" />
            		</div>
            		
            		<label class="control-label col-md-2" for="setting_type_text">
            		单位:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_unit_text" required="required" class="form-control" />
            		</div>
            	</div>    
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		制造商:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_maker_text" required="required" class="form-control" />
            		</div>
            		
            		<label class="control-label col-md-2" for="setting_type_text">
            		供货商:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_supply_text" required="required" class="form-control" />
            		</div>
            	</div>   
            	
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		单价:<span class="required">*</span>
            		</label>
            		<div class="col-md-3">
            			<input type="text" disabled="disabled" name="purchase_price_text" required="required" class="form-control" />
            		</div>
            		
            	</div>   
            	
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="purchase_purpose_text">
            		采购用途:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" disabled="disabled" name="purchase_purpose_text" required="required" class="form-control col-md-7" />
            		</div>
            	</div>  
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="setting_type_text">
            		备注:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<textarea rows="3"  name="purchase_remark_text" cols="" class="form-control col-md-7" ></textarea>
            		</div>
            	</div>  
         </div>
         <div class="modal-footer">

            <input type="button" data-dismiss="modal" class="btn btn-default" value="关闭"/>
            <button id="from_add_btn" onclick="ajax_finance_add()" type="button" class="btn btn-primary">确认入账
            </button>
         </div>
         </form>
         
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>

  <%@include file="../footer.html" %>
  <script src="<%=basePath %>/asset/manager_purchase.js" type="text/javascript"></script>
  
</body>
</html>