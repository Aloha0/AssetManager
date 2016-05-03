var $table = $('#asset_table');
    $table.bootstrapTable({
    url: '../ajaxasset_list', 
    dataType: 'json',
    method:'get',
    pagination: true,
    pageSize:15,
    singleSelect: false,
    search: true,
    showRefresh: true,
  //  sidePagination: "server", //服务端处理分页
          columns: [
                  {
                    title: 'ID',
                      field: 'id',
                      align: 'center',
                      valign: 'middle'
                  }, 
                  {
                      title: '资产名称',
                      field: 'name',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '资产类型',
                      field: 'type',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '在库状态',
                      field: 'instore',
                      align: 'center',
                      valign: 'middle',
                      formatter:function(value,row,index){  
                    	  if(value == 0)
                    		  return "未入库";
                    	  return "已入库";
                      } 
                  }, 
                  {
                      title: '财务入账',
                      field: 'infinance',
                      align: 'center',
                      valign: 'middle',
                      formatter:function(value,row,index){  
                    	  if(value == 0)
                    		  return "未入账";
                    	  return "已入账";
                      } 
                  }, 
                  {
                      title: '数量',
                      field: 'num',
                      align: 'center',
                      valign: 'middle',
                      formatter:function(value,row,index){  
                    	  return row.num + "  "+row.unit;
                      } 
                  }, 
                  {
                      title: '价格',
                      field: 'price',
                      align: 'center',
                      valign: 'middle',
                      formatter:function(value,row,index){  
                    	  return "￥ "+value;
                      } 
                  }, 
                  {
                      title: '操作',
                      field: 'id',
                      align: 'center',
                      formatter:function(value,row,index){
                    	  var s = '<a href="#" mce_href="#" onclick="open_modify_dialog()">查看</a> ';  
                    	  var e = '<a href="#" mce_href="#" onclick="open_modify_dialog(\''+ row.id +'\',\''+ row.name +'\',\''+ row.value +'\',\''+ row.type  + '\')">编辑</a> ';  
                    	  var d = '<a href="#" mce_href="#" onclick="ajax_setting_delete(\''+ row.id +'\')">删除</a> ';  
                        return s+e+d;  
                      } 
                  }
              ]
      });
    
    
    function open_add_dialog(id,name,value,type){
    	
    	$('#form_add_asset input').val('');
  	
    	$('#asset-add-modal').modal('show');
    }
    
    function open_modify_dialog(id,name,value,type){
    	$('#setting-add-modal h4[class="modal-title"]').text('修改系统参数');

    	$('#form_add_setting input[name="setting_name_text"]').val(name);
    	$('#form_add_setting input[name="setting_val_text"]').val(value);
    	$('#form_add_setting input[name="setting_type_text"]').val(type);
    	$('#form_add_setting input[name="setting_id_text"]').val(id);
    	
    	$('#from_add_btn').attr('onclick','ajax_setting_modify()');
    	$('#setting-add-modal').modal('show');
    }
       
    
    //添加
    function ajax_setting_add(){
    	$name   = $('#form_add_setting input[name="setting_name_text"]').val();
    	$value  = $('#form_add_setting input[name="setting_val_text"]').val();
    	$type   = $('#form_add_setting input[name="setting_type_text"]').val();
    	
    	var aj = $.ajax({  
    	    url:'../ajaxsetting_create',// 跳转到 action  
    	    data:{  
    	    	setting_name : $name,
    	    	setting_val  : $value,
    	    	setting_type : $type,
    	    },  
    	    type:'post',  
    	    cache:false,  
    	    dataType:'json',  
    	    success:function(data) {  
    	        alert(data.msg);  
    	        if(data.status =="0" ){  
    	             $('#setting-add-modal').modal('hide');
    	             $('#setting_table').bootstrapTable('refresh');
    	        }
    	     },  
    	     error : function() {  
    	    	alert("异常！");  
    	     }  
    	});
    }

    //更新
    function ajax_setting_modify(){
    	$name   = $('#form_add_setting input[name="setting_name_text"]').val();
    	$value  = $('#form_add_setting input[name="setting_val_text"]').val();
    	$type   = $('#form_add_setting input[name="setting_type_text"]').val();
    	$id     = $('#form_add_setting input[name="setting_id_text"]').val();
    	var aj = $.ajax({  
    	    url:'../ajaxsetting_update',// 跳转到 action  
    	    data:{  
    	    	setting_id   : $id,
    	    	setting_name : $name,
    	    	setting_val  : $value,
    	    	setting_type : $type,
    	    },  
    	    type:'post',  
    	    cache:false,  
    	    dataType:'json',  
    	    success:function(data) {  
    	        alert(data.msg);  
    	        if(data.status =="0" ){  
    	             $('#setting-add-modal').modal('hide');
    	             $('#setting_table').bootstrapTable('refresh');
    	        }
    	     },  
    	     error : function() {  
    	    	alert("异常！");  
    	     }  
    	});
    }
    
    
    //删除
    function ajax_setting_delete(id){
    	
    	BootstrapDialog.show({
            title: '确认删除参数',
            message: '参数信息将被永久删除',
            buttons: [{
                label: '确认',
                action: function(dialog) {
                    dialog.close();
                    var aj = $.ajax({  
    	        	    url:'../ajaxsetting_remove',// 跳转到 action  
    	        	    data:{  
    	        	    	setting_id : id,
    	        	    },  
    	        	    type:'post',  
    	        	    cache:false,  
    	        	    dataType:'json',  
    	        	    success:function(data) {  
    	        	        alert(data.msg);  
    	        	        if(data.status =="0" ){  
    	        	             $('#setting_table').bootstrapTable('refresh');
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
            
            
            
   