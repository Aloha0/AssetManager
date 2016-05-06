var $table = $('#asset_return_table');
    $table.bootstrapTable({
    url: '../ajaxassetreturn_list', 
    dataType: 'json',
    method:'get',
    pagination: true,
    pageSize:15,
    singleSelect: false,
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
                      title: '领用人',
                      field: 'recipient',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '领用日期',
                      field: 'gettime',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '归还人',
                      field: 'returner',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '归还日期',
                      field: 'returntime',
                      align: 'center',
                      valign: 'middle',
                  }, 
                  {
                      title: '当前状态',
                      field: 'status',
                      align: 'center',
                      valign: 'middle',
                      formatter:function(value,row,index){  
                    	  if(value == 0)
                    		  return "已借出";
                    	  return "在库中";
                      } 
                  }, 
                  {
                      title: '操作',
                      field: 'id',
                      align: 'center',
                      formatter:function(value,row,index){ 
                    	  var g = '<a href="#" mce_href="#" onclick="asset_get_open(\''+ row.id +'\')">领用</a> ';  
                    	  var r = '<a href="#" mce_href="#" onclick="asset_return_open(\''+ row.id +'\')">归还</a> '; 
                        return g+r;  
                      } 
                  }
              ]
      });
 

    //查询
    function search_asset_return(){
    	
    	$searchtext_name  = $('#search_assetreturn').val();
    	
    	var aj = $.ajax({  
    	    url:'../ajaxassetreturn_search_asset',// 跳转到 action  
    	    data:{  
    	    	asset_name : $searchtext_name,   ///    	    	
    	    },  
    	    type:'post',  
    	    cache:false,  
    	    dataType:'json',  
    	    success:function(data) {  
    	        alert(data.msg);  
    	        if(data.status =="0" ){  
    	             $('#asset_return_table').bootstrapTable('load',data.data);
    	        }
    	     },  
    	     error : function() {  
    	    	alert("异常！");  
    	     }  
    	});
    }
 
    //打开领用对话框
    function asset_get_open(id){
    	data = $table.bootstrapTable('getRowByUniqueId', id);
    	$('#form_asset_get input[name="assetreturn_name_text"]').val(data.asset_name);
    	$('#form_asset_get input[name="asset_id_text"]').val(data.assetid);
    	$('#form_asset_get input[name="recipient_id_text"]').val(data.recipientid);
    	
    	$('#asset-get-modal').modal("show");
    }
    
    //领用
function ajax_asset_get(){
	//alert(data.name);
	$asset_get_name = $('#form_asset_get input[name="assetreturn_name_text"]').val();
	$asset_id = $('#form_asset_get input[name="asset_id_text"]').val();
	$recipient_id = $('#form_asset_get input[name="recipient_id_text"]').val();
	
	var aj = $.ajax({  
	    url:'../ajaxassetreturn_create',// 跳转到 action  
	    data:{  
	    	assetid : asset_id,
	    	recipientid : recipient_id,
	    },  
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        alert(data.msg);  
	        if(data.status =="0" ){  
	             $('#asset_return_table').bootstrapTable('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
	
}
          
//打开归还对话框
function asset_return_open(id){
	data = $table.bootstrapTable('getRowByUniqueId', id);
	$('#form_asset_return input[name="assetreturn_name_text"]').val(data.asset_name);
	$('#form_asset_return input[name="asset_id_text"]').val(data.assetid);
	$('#form_asset_return input[name="recipient_id_text"]').val(data.recipientid);
	$('#form_asset_return input[name="returner_id_text"]').val(data.returnerid);
	
	$('#asset-return-modal').modal("show");
}

     //归还
function ajax_asset_return(){
	//alert(data.name);
	$asset_name = $('#form_asset_return input[name="assetreturn_name_text"]').val();
	$asset_id = $('#form_asset_return input[name="asset_id_text"]').val();
	$returner_id = $('#form_asset_return input[name="returner_id"]').val();
	
	var aj = $.ajax({  
	    url:'../ajaxassetreturn_update',// 跳转到 action  
	    data:{  
	    	asset_id : asset_id,
	    	returner_id : returner_id,
	    },  
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        alert(data.msg);  
	        if(data.status =="0" ){  
	             $('#asset_return_table').bootstrapTable('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
	
}
   