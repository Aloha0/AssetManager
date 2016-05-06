<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>



<!-- 模态框（Modal） -->
<div class="modal fade "  id="depart-add-modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              添加部门
            </h4>
         </div>
         <div class="modal-body">
            <form action="" class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="depart_name">
            		部门名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" id="depart_name" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
            
            </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_add_section()" type="button" class="btn btn-primary">提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->

<!-- 模态框（Modal） -->
<div class="modal fade "  id="depart-edit-modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              编辑部门
            </h4>
         </div>
         <div class="modal-body">
            <form id="form_depart_edit" action="" class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="depart_name">
            		部门名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="depart_name" required="required" class="form-control col-md-7" />
            			<input type="text" name="depart_id" required="required" class="hide form-control col-md-7" />
            		</div>
            	</div>
            
            </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_edit_section()" type="button" class="btn btn-primary">提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->

<!-- 模态框（Modal） -->
<div class="modal fade"  id="assettype-add-modal" tabindex="-1" role="dialog" 
   aria-labelledby=""  >
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
              添加资产类型
            </h4>
         </div>
         <div class="modal-body">
            <form id="form_assettype_add" action=" " class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_type_num">
            		资产类别编码:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_num" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_type_name">
            		资产类别名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_name" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_type_name">
            		上级资产类别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_prename" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
            
            </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_add_assettype()" type="button" class="btn btn-primary">提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->





<!-- 模态框（Modal） -->
<div class="modal fade"  id="assettype-edit-modal" tabindex="-1" role="dialog" 
   aria-labelledby=""  >
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" >
           编辑资产类别
            </h4>
         </div>
         <div class="modal-body">
            <form id="form_assettype_edit" action="" class="form-horizontal form-label-left">
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_type_num">
            		资产类别编码:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_num" required="required" class="form-control col-md-7" />
            			<input type="text" name="asset_type_id" required="required" class=" form-control col-md-7" />

            		</div>
            	</div>
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_type_name">
            		资产类别名称:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_name" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
            	<div class="form-group">
            		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="asset_type_num">
            		上级资产类别:<span class="required">*</span>
            		</label>
            		<div class="col-md-8">
            			<input type="text" name="asset_type_prename" required="required" class="form-control col-md-7" />
            		</div>
            	</div>
            
            </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button onclick="ajax_edit_assettype()" type="button" class="btn btn-primary">提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->
</body>
</html>