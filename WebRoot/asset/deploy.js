//显示Table
var $departtable = $('#depart_table');
	$departtable.bootstrapTable({
    url: '../ajaxsection_list', 
    dataType: 'json',
    method:'get',
    pagination: true,
    pageSize:5,
    singleSelect: false,
  //  data-locale:"zh-US", //表格汉化
  //  sidePagination: "server", //服务端处理分页
          columns: [
                  {
                    title: 'ID',
                      field: 'id',
                      align: 'center',
                      valign: 'middle'
                  }, 
                  {
                      title: '部门名称',
                      field: 'name',
                      align: 'center',
                      valign: 'middle',
                  }, 

                  {
                      title: '操作',
                      field: 'id',
                      align: 'center',
                      formatter:function(value,row,index){  
                    	  var e = '<a href="#" mce_href="#" onclick="open_edit_dialog(\''+ row.id + '\')">编辑</a> ';  
                    	  var d = '<a href="#" mce_href="#" onclick="ajax_delete_section(\''+ row.id +'\')">删除</a> ';  
                        return e+d;  
                      } 
                  }
              ]
      });
   

function open_edit_dialog(id){
	data = $departtable.bootstrapTable('getRowByUniqueId', id);
	//alert(data.name);
	$('#form_depart_edit input[name="depart_id"]').val(data.id);
	$('#form_depart_edit input[name="depart_name"]').val(data.name);
	$('#depart-edit-modal').modal("show");
}    
    
//添加
function ajax_add_section(){
	$section_name = $('#depart_name').val();
	var aj = $.ajax({  
	    url:'../ajaxsection_create',// 跳转到 action  
	    data:{  
	    	section_name : $section_name,
	    },  
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        alert(data.msg);  
	        if(data.status =="0" ){  
	             $('#depart-add-modal').modal('hide');
	             $('#depart_table').bootstrapTable('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
}

//编辑
function ajax_edit_section(){
	$section_name = $('#form_depart_edit input[name="depart_name"]').val();
	$section_id   = $('#form_depart_edit input[name="depart_id"]').val();

	var aj = $.ajax({  
	    url:'../ajaxsection_update',// 跳转到 action  
	    data:{  
	    	section_id   : $section_id,
	    	section_name : $section_name,
	    },  
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        alert(data.msg);  
	        if(data.status =="0" ){  
	             $('#depart-edit-modal').modal('hide');
	             $('#depart_table').bootstrapTable('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
}

//删除
function ajax_delete_section(id){
	
	BootstrapDialog.show({
        title: '确认删除部门',
        message: '部门信息将被永久删除',
        buttons: [{
            label: '确认',
            action: function(dialog) {
                dialog.close();
                var aj = $.ajax({  
	        	    url:'../ajaxsection_remove',// 跳转到 action  
	        	    data:{  
	        	    	section_id : id,
	        	    },  
	        	    type:'post',  
	        	    cache:false,  
	        	    dataType:'json',  
	        	    success:function(data) {  
	        	        alert(data.msg);  
	        	        if(data.status =="0" ){  
	        	             $('#depart_table').bootstrapTable('refresh');
	        	        }
	        	     },  
	        	     error : function() {  
	        	    	alert("异常！");  
	        	     }  
	        	});
            }
        }, {
            label: '取消',
            action: function(dialog) {
                dialog.close();
            }
        }]
    });
	/*
	$("#dialog-confirm" ).dialog({
	      resizable: false,
	      height:140,
	      modal: true,
	      buttons: {
	        "确定": function() {
	        	$( this ).dialog( "close" );
	        	var aj = $.ajax({  
	        	    url:'../ajaxsection_delete',// 跳转到 action  
	        	    data:{  
	        	    	section_id : id,
	        	    },  
	        	    type:'post',  
	        	    cache:false,  
	        	    dataType:'json',  
	        	    success:function(data) {  
	        	        alert(data.msg);  
	        	        if(data.status =="0" ){  
	        	             $('#depart_table').bootstrapTable('refresh');
	        	        }
	        	     },  
	        	     error : function() {  
	        	    	alert("异常！");  
	        	     }  
	        	});
	        },
	        "取消": function() {
	          $( this ).dialog( "close" );
	        }
	      }
	});
	*/

}
    
    
    
var $table = $('#asset_type_table');
    $table.bootstrapTable({
    url: '../ajaxassetType_list', 
    dataType: 'json',
    method:'get',
    pagination: true,
    pageSize:5,
    singleSelect: false,
          columns: [
                  {
                    title: 'ID',
                      field: 'id',
                      align: 'center',
                      valign: 'middle'
                  }, 
                  {
                      title: '资产类别编码',
                      field: 'typenum',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '资产类型名称',
                      field: 'name',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '上级资产类型名称',
                      field: 'prename',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '操作',
                      field: 'id',
                      align: 'center',
                      formatter:function(value,row,index){  
                    	  var e = '<a href="#" mce_href="#" onclick="open_typeedit_dialog(\''+ row.id + '\')">编辑</a> ';  
                    	  var d = '<a href="#" mce_href="#" onclick="ajax_delete_assettype(\''+ row.id +'\')">删除</a> ';  
                        return e+d;  
                      } 
                  }
              ]
      });
    
    function open_typeedit_dialog(id){
    	data = $table.bootstrapTable('getRowByUniqueId', id);
    	//alert(data.name);
    	$('#form_assettype_edit input[name="asset_type_num"]').val(data.typenum);
    	$('#form_assettype_edit input[name="asset_type_name"]').val(data.name);
    	$('#form_assettype_edit input[name="asset_type_prename"]').val(data.prename);
    	
    	$('#assettype-edit-modal').modal("show");
    }    
    
  //添加
    function ajax_add_assettype(){
    	$assettype_num = $('#form_assettype_add input[name="asset_type_num"]').val();
    	$assettype_name = $('#form_assettype_add input[name="asset_type_name"]').val();
    	$assettype_prename = $('#form_assettype_add input[name="asset_type_prename"]').val();
    	var aj = $.ajax({  
    	    url:'../ajaxassettype_create',// 跳转到 action  
    	    data:{  
    	    	asset_type_num : $assettype_num,
    	    	asset_type_name : $assettype_name,
    	    	asset_type_prename : $assettype_prename,
    	    },  
    	    type:'post',  
    	    cache:false,  
    	    dataType:'json',  
    	    success:function(data) {  
    	        alert(data.msg);  
    	        if(data.status =="0" ){  
    	        	$('#assettype-add-modal').modal('hide');
   	                $('#assettype_table').bootstrapTable('refresh');
    	        }
    	     },  
    	     error : function() {  
    	    	alert("异常！");  
    	     }  
    	});
    }
    
  //编辑
    function ajax_edit_assettype(){
    	$assettype_id   = $('#form_assettype_edit input[name="asset_type_id"]').val(); //jsp
    	$assettype_num = $('#form_assettype_edit input[name="asset_type_num"]').val();
    	$assettype_name = $('#form_assettype_edit input[name="asset_type_name"]').val();
    	$assettype_prename = $('#form_assettype_edit input[name="asset_type_prename"]').val();

    	
    	var aj = $.ajax({  
    	    url:'../ajaxassettype_update',// 跳转到 action  
    	    data:{  
    	    	asset_type_id : $assettype_id,
    	    	asset_type_num : $assettype_num,
    	    	asset_type_name : $assettype_name,
    	    	asset_type_prename : $assettype_prename,
    	    },  
    	    type:'post',  
    	    cache:false,  
    	    dataType:'json',  
    	    success:function(data) {  
    	        alert(data.msg);  
    	        if(data.status =="0" ){  
    	             $('#assettype-edit-modal').modal('hide');
    	             $('#assettype_table').bootstrapTable('refresh');
    	        }
    	     },  
    	     error : function() {  
    	    	alert("异常！");  
    	     }  
    	});
    }
    
  //删除
    function ajax_delete_assettype(id){
    	
    	BootstrapDialog.show({
            title: '确认删除资产类型',
            message: '资产类型信息将被永久删除',
            buttons: [{
                label: '确认',
                action: function(dialog) {
                    dialog.close();
                    var aj = $.ajax({  
    	        	    url:'../ajaxassettype_remove',// 跳转到 action  
    	        	    data:{  
    	        	    	asset_type_id : id,   //assettype_id
    	        	    },  
    	        	    type:'post',  
    	        	    cache:false,  
    	        	    dataType:'json',  
    	        	    success:function(data) {  
    	        	        alert(data.msg);  
    	        	        if(data.status =="0" ){  
    	        	             $('#depart_table').bootstrapTable('refresh');
    	        	        }
    	        	     },  
    	        	     error : function() {  
    	        	    	alert("异常！");  
    	        	     }  
    	        	});
                }
            }, {
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }]
        });
    }